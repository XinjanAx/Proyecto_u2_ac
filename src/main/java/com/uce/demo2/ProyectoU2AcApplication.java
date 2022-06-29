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

	@Autowired
	private IPersonajpaService iPersonajpaService;
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona();
		p1.setId(312);
		p1.setNombre("Andrea");
		p1.setApellido("Bena");
		
		this.iPersonajpaService.guardar(p1);
		Log.info(this.iPersonajpaService.buscarPorId(1));
		
		p1.setApellido("Benabides");
		
		this.iPersonajpaService.actualizar(p1);
		Log.info(this.iPersonajpaService.buscarPorId(312));
		this.iPersonajpaService.eliminar(1);
		
	}

}
