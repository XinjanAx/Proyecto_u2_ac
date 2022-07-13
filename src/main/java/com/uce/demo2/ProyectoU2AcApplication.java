package com.uce.demo2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.modelo.Persona;
import com.uce.demo2.service.IPersonajpaService;


@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IPersonajpaService iPersonajpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Persona p = new Persona();

        p.setNombre("Lucas");
        p.setApellido("Guaranda");
        p.setCedula("0696699696");
        p.setGenero("M");
        
        // Guardar
        //this.iPersonajpaService.guardar(p);
        
        Log.info("\nBuscado con Native" + iPersonajpaService.buscarPorCedulaNative("0696699696"));
        Log.info("\nBuscado con Named/Typed Native" + iPersonajpaService.buscarPorCedulaNamedNative("17348882349"));
       

	}
}
