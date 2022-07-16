package com.uce.demo2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.colegio.service.IEstudianteJPAService;
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
		
		Log.info("\nPersona CriteriaAPI"+this.iPersonajpaService.buscarPorCedulaCriteriaApi("17348882349"));
		
		
		Log.info("\nPersona Dinamica"+this.iPersonajpaService.busquedaDinamica("Yisus", "De'Jerusalen", "F"));
		
	}
}
