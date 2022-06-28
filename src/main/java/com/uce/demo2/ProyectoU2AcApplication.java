package com.uce.demo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.uce.demo3.colegio.service.IEstudianteService;
import com.uce.demo3.colegio.to.Estudiante;

@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	//Logger Logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante e1 = new Estudiante();
		e1.setId(36);
		e1.setNombre("Alex");
		e1.setApellido("Condor");
		e1.setEdad(25);
		e1.setIngreso("04-08-2019");
		
		this.estudianteService.ingresar(e1);
				
		e1.setApellido("Guerron");
		
		//this.estudianteService.actualizar(e1);
		
		Estudiante e2 = new Estudiante();
		e2.setId(95);
		e2.setNombre("AndresSSS");
		e2.setApellido("De'Nasared");
		e2.setEdad(22);
		e2.setIngreso("19-11-2020");
		
		//this.estudianteService.ingresar(e2);
		
		//this.estudianteService.eliminar(95);

		//Logger.info(this.estudianteService.buscarPorId(1));
		
	}

}
