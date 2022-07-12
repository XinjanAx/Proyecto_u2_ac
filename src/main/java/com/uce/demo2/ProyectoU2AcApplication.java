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
	private IPersonajpaService iPersonaJpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		Persona p = new Persona();
		p.setNombre("Jose");
	    p.setApellido("De'Jerusalen");
	    p.setCedula("04684211");
	    p.setGenero("Undefinide");
	    
	    //this.iPersonaJpaService.guardar(p);
	    
	    //1 TypedQuery
        Persona perTyped = this.iPersonaJpaService.buscarPorCedulaTyped("036846351");
        Log.info("\nPersona Typed: " + perTyped);

        //2 NamedQuery
        Persona perNamed = this.iPersonaJpaService.buscarPorCedulaNamed("17348882349");
        Log.info("\nPersona Named: " + perNamed);

        //3 TypedQuery y NamedQuery
        Persona perTypedNamed = this.iPersonaJpaService.buscarPorCedulaTypedNamed("14748134");
        Log.info("\nPersona TypedNamed: " + perTypedNamed);
	    
        //4 Varios NamedQuery
        
        Log.info("\nPersonas con mismo nombre y apellidos"+this.iPersonaJpaService.buscarPorNombreApellido("Jose", "De'Jerusalen"));
	}
}
