package com.empresa.proyecto;

import javax.xml.ws.Endpoint;


public class Publisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8181/wsExamen/examen", new ServicioFactura());
		System.out.println("Servicio Iniciado");
	}

}