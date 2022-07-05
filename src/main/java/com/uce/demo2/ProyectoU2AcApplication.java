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
	private IPersonajpaService iPersonaJpaService;
		
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

        Persona p = new Persona();
        //p.setId(65);
        p.setNombre("Mike2");
        p.setApellido("Wasauski");
        //Guardar
        this.iPersonaJpaService.guardar(p);

        Persona p1 = new Persona();
        p1.setNombre("Adam");
        p1.setApellido("Maldonado");
        //Actualizar
        p1.setId(1);
        //this.iPersonaJpaService.actualizar(p1);

        //Eliminar
        //this.iPersonaJpaService.eliminar(65);
	
	}
}
