package com;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;;

@WebService()
public class ServicioPersona implements IServicioPersona {
	
	
	public List<Persona> listar(){
		
		List<Persona> personas=new ArrayList<>();
		personas.add(new Persona(1, "Elsa", "Pato"));
		personas.add(new Persona(2, "Susana", "Oria"));
		personas.add(new Persona(3, "Elmer", "Curio"));
		return personas;
	}
	
	public String Cadena(@WebParam(name="Nombre") String nombre) {
		return "Hola "+nombre;
	}
	
	

}
