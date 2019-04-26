package com.demo;

public class Persona {
	
	private int idPersona;
	private String nomPersona,apePersona;
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNomPersona() {
		return nomPersona;
	}
	public void setNomPersona(String nomPersona) {
		this.nomPersona = nomPersona;
	}
	public String getApePersona() {
		return apePersona;
	}
	public void setApePersona(String apePersona) {
		this.apePersona = apePersona;
	}
	public Persona(int idPersona, String nomPersona, String apePersona) {
		this.idPersona = idPersona;
		this.nomPersona = nomPersona;
		this.apePersona = apePersona;
	}
	public Persona() {
		
	}
	
	

}
