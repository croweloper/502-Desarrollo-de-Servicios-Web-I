package com.empresa.proyecto;

public class Factura {
	
	private String NroFactura;
	private String IdCliente;
	private String FechaFactura;
	private double MontoFactura;
	private String EstadoFactura;
	
	public String getNroFactura() {
		return NroFactura;
	}
	public void setNroFactura(String nroFactura) {
		NroFactura = nroFactura;
	}
	public String getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}
	public String getFechaFactura() {
		return FechaFactura;
	}
	public void setFechaFactura(String fechaFactura) {
		FechaFactura = fechaFactura;
	}
	public double getMontoFactura() {
		return MontoFactura;
	}
	public void setMontoFactura(double montoFactura) {
		MontoFactura = montoFactura;
	}
	public String getEstadoFactura() {
		return EstadoFactura;
	}
	public void setEstadoFactura(String estadoFactura) {
		EstadoFactura = estadoFactura;
	}
	
	public Factura(String nroFactura, String idCliente, String fechaFactura, double montoFactura, String estadoFactura) {
		
		NroFactura = nroFactura;
		IdCliente = idCliente;
		FechaFactura = fechaFactura;
		MontoFactura = montoFactura;
		EstadoFactura = estadoFactura;
	}
	public Factura() {
		
	}
	
	
	
	

}
