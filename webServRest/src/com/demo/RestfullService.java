package com.demo;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.WebApplicationException;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Consumes;//Entrada
import javax.ws.rs.Produces;//Salida
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/personas")
public class RestfullService {
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Persona> listarPersonas(){
		
		List<Persona> persona= new ArrayList<>();
		persona.add(new Persona(1,"Elmer","Curio"));
		persona.add(new Persona(2,"Susana","Oria"));
		persona.add(new Persona(3,"Elsa","Pato"));
		
		return persona;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("{id}")
	public Persona getData(String id)  {
		if("1".equals(id)) {
			return new Persona(1,"Elmer","Curio");
		}if("2".equals(id)) {
			return new Persona(2,"Susana","Oria");
		}throw new WebApplicationException(404);
		
	}
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public void save(Persona data) {
		System.out.println(data.toString()+"Creado");
	}
	
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Persona update(@PathParam("id") int id,Persona data) {
		data.setIdPersona(id);
		if (id==1 || id==2) {
			System.out.println(data.toString()+"Actualizado");			
		}else {
			System.out.println(data.toString()+"Creado");
		}
		return data;
	}
	
	@DELETE
	@Path("{id}")
	public void remove(int id) {
		if (id==1 || id==2) {
			System.out.println("Data Removed");			
		}else {
			throw new WebApplicationException(404);
		}
		
	}

}
