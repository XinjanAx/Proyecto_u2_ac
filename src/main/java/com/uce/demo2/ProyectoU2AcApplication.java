package com.uce.demo2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.modelo.onetomany.Habitacion;
import com.uce.demo2.modelo.onetomany.Hotel;
import com.uce.demo2.service.onetomany.IHabitacionService;
import com.uce.demo2.service.onetomany.IHotelJpaService;


@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IHotelJpaService hotelJpaService;
	
	@Autowired
	private IHabitacionService habitacionService;
		
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Hotel h1 = new Hotel();
		h1.setNombre("MiraMar");
		h1.setDireccion("Atacames EC, Bulevar Plazoneta Atacames");
		
		this.hotelJpaService.insertar(h1);
		
		Habitacion hb1 = new Habitacion();
		hb1.setNumero("c58");
		hb1.setPiso("2a");
		hb1.setTipo("Familiar");
		
		Hotel h2 = new Hotel();
		h2.setId(2);
		hb1.setHotelRel(h2);
		
		
		this.habitacionService.insertar(hb1);
		
	}
}
