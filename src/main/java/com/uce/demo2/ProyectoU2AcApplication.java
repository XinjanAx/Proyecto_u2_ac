package com.uce.demo2;


import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.tarea22.modelo.Ciudadano22;
import com.uce.demo2.tarea22.modelo.Pasaporte;
import com.uce.demo2.tarea22.service.ICiudadano22JpaService;


@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private ICiudadano22JpaService ciudadanoJpaService;
		
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ciudadano22 c1 = new Ciudadano22();
		c1.setCedula("1788458446");
		c1.setApellido("Maldonado");
		c1.setNombre("Teodoro");
		c1.setFecha(LocalDate.of(1999, 1, 22));
		
		
		Pasaporte p1 = new Pasaporte();
		p1.setNumero("_019");
		p1.setCiudadano1(c1);
		p1.setfEmision(LocalDate.now());
		p1.setfCaducidad(LocalDate.of(2026, 9, 15));
		

		c1.setPasaporte(p1);
		this.ciudadanoJpaService.insertar(c1);
		
		Log.info(this.ciudadanoJpaService.buscar("1268435218"));
		
		c1.setApellido("Herrera");
		
		this.ciudadanoJpaService.actualizar(c1);
		
		this.ciudadanoJpaService.eliminar("1268435218");
	}
}
