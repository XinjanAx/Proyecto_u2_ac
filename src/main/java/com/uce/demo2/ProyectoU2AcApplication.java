package com.uce.demo2;

import java.time.LocalDateTime;

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
		
		
		Estudiante e1 = new Estudiante();

		e1.setNombre("Mauricio");
		e1.setApellido("Merardo");
		e1.setCedula("1788468542");
		e1.setEdad(25);
		e1.setGratuidad(false);
		e1.setFecha(LocalDateTime.now());
		
		//this.estudianteJPAService.ingresar(e1);
				
		
		Estudiante e2 = new Estudiante();
		e2.setNombre("Izma");
		e2.setApellido("Guadalupe");
		e2.setCedula("0477655413");
		e2.setEdad(27);
		e1.setGratuidad(false);
		e2.setFecha(LocalDateTime.of(2017, 06, 15, 22, 14));
		
		//this.estudianteJPAService.ingresar(e2);
		
		Log.info("\nSe encontro al: "+this.estudianteJPAService.buscarPorCedula("1722341354"));
		
		Log.info("\nEstudiantes por edades: "+this.estudianteJPAService.listaEdadesDecendentes());

		Log.info("\nEstudiantes con gratuidad: "+this.estudianteJPAService.listaEstudiantesGratuitos());

		Log.info("\nEstudiante/s : "+this.estudianteJPAService.buscarPorNombreApellido("Alex", "Guerron"));

		Log.info("\nSe encontro CON TypedNamed al: "+this.estudianteJPAService.buscarPorCedulaTypedNamed("1798465413"));
		
		Integer edad = 25;
		Log.info("\nEstudiantes menores de " + edad + " años:" +this.estudianteJPAService.listaEstudiantesGratuitosMenoresA(edad));
		
	}
}
