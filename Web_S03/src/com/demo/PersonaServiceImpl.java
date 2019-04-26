package com.demo;

import java.util.ArrayList;
import java.util.List;

public class PersonaServiceImpl implements IPersonaService {

	@Override
	public Persona buscarId(int id) {
		// 
		List<Persona> lista=new ArrayList<Persona>();
		lista.add(new Persona(1,"Susana Oria"));
		lista.add(new Persona(2,"Elsa Pato"));
		
		Persona persona=null;
		for(Persona p:lista) {
			if(p.getId()==id) {
				persona=p;
			}
		}
		
		return persona;
	}
	

}
