package com.uce.demo2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.tarea16.modelo.Matricula;
import com.uce.demo2.tarea16.modelo.Propietario;
import com.uce.demo2.tarea16.modelo.Vehiculo;
import com.uce.demo2.tarea16.service.IMatriculaGestorService;
import com.uce.demo2.tarea16.service.IPropietarioService;
import com.uce.demo2.tarea16.service.IVehiculoService;




@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	//@Autowired
	//private IMatriculaGestorService matriculaGService;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IVehiculoService vehiculoService;
		
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

    Propietario p1 = new Propietario();
    p1.setCedula("126874484");
    p1.setNombre("Adres");
    p1.setApellido("Chango");
    
    this.propietarioService.insertar(p1);
    this.propietarioService.eliminar("176874655");
    
    
    Vehiculo v1 = new Vehiculo();
    v1.setMarca("Nissan");
    v1.setModelo("GTR-r35");
    v1.setPlaca("v4");
    v1.setTipo("L");
    v1.setPrecio(new BigDecimal(57000));
      
    this.vehiculoService.insertar(v1);
    Log.info(this.vehiculoService.buscar("v3"));
    this.vehiculoService.actializar(v1);
    this.vehiculoService.eliminar("v3");
        
    //this.matriculaGService.generar(p1.getCedula(), v1.getPlaca());
    
	}
}
