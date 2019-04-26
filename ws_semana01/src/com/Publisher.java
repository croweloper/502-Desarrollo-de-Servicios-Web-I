package com;

import javax.xml.ws.*;
public class Publisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:9010/wspersona/Persona", new ServicioPersona());
		System.out.println("Iniciado");
	}

}
