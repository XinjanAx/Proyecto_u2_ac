package com.uce.demo2;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.tarea23.modelo.Ciudad;
import com.uce.demo2.tarea23.modelo.Pais;
import com.uce.demo2.tarea23.service.ICiudadService;
import com.uce.demo2.tarea23.service.IPaisService;


@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IPaisService paisService;
	@Autowired
	private ICiudadService ciudadService;
		
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
			
		Pais p1 = new Pais();
		p1.setNombre("Ecuador");
		p1.setIdioma("Español");
		p1.setTipo("3erM");
		p1.setTerritorio("256 370");
		
		this.paisService.insertar(p1);	
		
		this.paisService.buscarPorNombre("Peru");
		
		this.paisService.actualizar(p1);
		
		this.paisService.eliminarPorNombre("Brazil");



		
	}
}
