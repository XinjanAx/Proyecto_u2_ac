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
	private IEstudianteJPAService estudianteJPAService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Native---------------------
        Log.info("\nBuscado por cedula con Native" + this.estudianteJPAService.buscarPorCedulaNative("1722341354"));
        
        Log.info("\nEstudiantes con gratuidad con Native" + this.estudianteJPAService.listaEstudiantesGratuitosNative());
        
        //NamedNative---------------------
        Log.info("\nEdades Desendentes con NamedNative" + this.estudianteJPAService.listaEdadesDecendentesNamedNative());
        
        Log.info("\nEstudiantes con gratuidad menores A: con NamedNative" + this.estudianteJPAService.listaEstudiantesGratuitosMenoresANamedNative(25));

	}
}
