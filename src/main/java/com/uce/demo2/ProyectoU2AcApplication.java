package com.uce.demo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.service.IPersonadbcService;
import com.uce.demo2.to.Persona;

@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{

	@Autowired
	private IPersonadbcService iPersonadbcService;
	
	Logger Logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		p.setId(1);
		p.setNombre("Alex");
		p.setApellido("Condor");
		
		//this.iPersonadbcService.guardar(p);	
		Persona p2 = new Persona();
		p.setId(1);
		p.setNombre("Andres");
		p.setApellido("De'Nasared");
		
		//this.iPersonadbcService.actualizar(p2);
		
		//this.iPersonadbcService.eliminar(2);

		Logger.info(this.iPersonadbcService.buscarPorId(1));
		
	}

}
