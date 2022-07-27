package com.uce.demo2;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.cajero.modelo.DetalleFactura;
import com.uce.demo2.cajero.modelo.Factura;
import com.uce.demo2.cajero.service.IFacturaService;



@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	

	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
			
		Factura fact = this.facturaService.consultarPorId(1);
        Log.info("Numero: "+fact.getNumero());
        Log.info("Fecha: "+fact.getFecha());

        Log.info("Cliente: "+fact.getCliente().getFacturas());
		
        List<DetalleFactura> detalles = fact.getDetalles();
        for (DetalleFactura detalle: detalles) {
            Log.info(detalle);
        }
        
	}
}
