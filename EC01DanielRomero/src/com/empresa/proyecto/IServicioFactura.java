package com.empresa.proyecto;

import java.util.List;

public interface IServicioFactura {

	List<Factura> GenerarLista();
	
	List<Factura> FacturasxCliente(String idCliente);
	
	String ProcesoCorrecto(Factura fac);
	
	
}
