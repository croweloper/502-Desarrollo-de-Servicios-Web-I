package com.empresa.proyecto;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService()
public class ServicioFactura implements IServicioFactura {

	@Override
	public List<Factura> GenerarLista() {
		List<Factura> lstfacturas=new ArrayList<>();
		lstfacturas.add(new Factura("F0001", "C0001", "10/10/2005",200.2,"p"));
		lstfacturas.add(new Factura("F0002", "C0002", "10/10/2005",2000.1,"p"));
		lstfacturas.add(new Factura("F0003", "C0003", "10/10/2005",300.2,"p"));
		lstfacturas.add(new Factura("F0004", "C0001", "10/10/2005",500.2,"s"));
		lstfacturas.add(new Factura("F0005", "C0001", "10/10/2005",600.2,"p"));
		lstfacturas.add(new Factura("F0006", "C0002", "10/10/2005",1000.2,"p"));
		lstfacturas.add(new Factura("F0007", "C0003", "10/10/2005",5000.2,"s"));
		lstfacturas.add(new Factura("F0008", "C0002", "10/10/2005",9900.2,"p"));
		lstfacturas.add(new Factura("F0009", "C0001", "10/10/2005",5.2,"p"));
		lstfacturas.add(new Factura("F0010", "C0001", "10/10/2005",300.2,"p"));
		lstfacturas.add(new Factura("F0011", "C0001", "10/10/2005",500.5,"s"));
		
		return lstfacturas;
	}

	
	@Override
	public List<Factura> FacturasxCliente(@WebParam(name="idCliente") String idCliente) {
		List<Factura> lstfaturas=GenerarLista();
		List<Factura> lstfacturascliente=new ArrayList<>();
		//utilicen un for simple mulas!
		for (Factura factura : lstfaturas) {
			
			if(factura.getIdCliente().equals(idCliente) && factura.getEstadoFactura().equals("p")) {
				lstfacturascliente.add(factura);
			}				
			
		}
		
		
		return lstfacturascliente;
	}

	@Override
	public String ProcesoCorrecto(@WebParam Factura fac) {
		
		List<Factura> lstfaturas=GenerarLista();
		System.out.println("Factura"+fac.toString());
		
		return "Proceso Correcto";
	}

}
