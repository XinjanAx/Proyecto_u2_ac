package com.uce.demo2;


import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.modelo.Ciudadano;
import com.uce.demo2.modelo.Empleado;
import com.uce.demo2.service.ICiudadanoJpaService;
import com.uce.demo2.service.IEmpleadoJpaService;


@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private ICiudadanoJpaService ciudadanoJpaService;
	@Autowired
	private IEmpleadoJpaService empleadoJpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		Ciudadano c1 = new Ciudadano();
		c1.setNombre("Mike");
		c1.setApellido("Wasauski");
		
	    Empleado e1 = new Empleado();
	    e1.setCodigoIess("1234");
	    e1.setSalario(new BigDecimal(100));
	    e1.setCiudadano1(c1);

	    //ciu1.setEmpleado(empl1);
		
		this.ciudadanoJpaService.insertar(c1);
		this.empleadoJpaService.insertar(e1);
		
	}
}
