package com.uce.demo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.colegio.modelo.Estudiante;
import com.uce.demo2.colegio.service.IEstudianteJPAService;


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
		// TODO Auto-generated method stub
		
		Estudiante e1 = new Estudiante();
		e1.setId(338);
		e1.setNombre("Andrea");
		e1.setApellido("Chang");
		e1.setEdad(20);
		e1.setFecha("31-10-2009");
		
		this.estudianteJPAService.ingresar(e1);
		
		Log.info(this.estudianteJPAService.buscarPorId(338));
		
		e1.setApellido("Chango");
		
		this.estudianteJPAService.actualizar(e1);
		

		Log.info(this.estudianteJPAService.buscarPorId(318));
		
		Log.info(this.estudianteJPAService.buscarPorId(745));
		
		this.estudianteJPAService.eliminar(745);
	
	}
}
