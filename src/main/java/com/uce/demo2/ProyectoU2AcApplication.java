package com.uce.demo2;


import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.modelo.manytomany.Autor;
import com.uce.demo2.modelo.manytomany.Libro;
import com.uce.demo2.service.manytomany.IAutorService;
import com.uce.demo2.service.manytomany.ILibroService;



@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	
	
	
	@Autowired
	private ILibroService iLibroService;
	@Autowired
	private IAutorService autorService;
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
			
		Libro l1 = new Libro();
		l1.setTitulo("El Sr de los anillos");
		l1.setPaginas(1755);
		
		Autor a1 = new Autor();
		a1.setNombre("Tolkien");
		
		Set<Autor> autores = new HashSet<>();
		autores.add(a1);
		l1.setAutores(autores);
		
		this.iLibroService.incertarL(l1);
		
	}
}
