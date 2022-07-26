package com.uce.demo2;


import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.tarea24.modelo.AutorLibro;
import com.uce.demo2.tarea24.modelo.AutorT;
import com.uce.demo2.tarea24.modelo.LibroT;
import com.uce.demo2.tarea24.service.IAutorTService;
import com.uce.demo2.tarea24.service.ILibroTService;



@SpringBootApplication
public class ProyectoU2AcApplication implements CommandLineRunner{
	
	
	
	@Autowired
	private ILibroTService iLibroService;
	@Autowired
	private IAutorTService autorService;

	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
			
		LibroT libro = new LibroT();
		libro.setTitulo("La bella y la bestia");
		libro.setPaginas(147);
		
				AutorLibro al1 =new AutorLibro();
					
					AutorT a1 = new AutorT();
					a1.setNombre("Samuel L.L. Jason");
					
				al1.setAutores(a1);	
				al1.setLibros(libro);
			
				AutorLibro al2 =new AutorLibro();
					AutorT a2 = new AutorT();
					a2.setNombre("Tolkien");
				al2.setLibros(libro);
				al2.setAutores(a2);	
			
			Set<AutorLibro> lista1 = new HashSet<>();
			lista1.add(al1);
			lista1.add(al2);
		libro.setAutoresLibrosL(lista1);

		
		this.autorService.insertarAutor(a1);
		this.autorService.insertarAutor(a2);
		this.iLibroService.insertarLibro(libro);
		
		AutorT autor = new AutorT();
		autor.setNombre("Julio Verne");
		
				AutorLibro al3 =new AutorLibro();
					LibroT l1 = new LibroT();
					l1.setTitulo("Viaje a la Luna");
					l1.setPaginas(339);
				al3.setAutores(autor);
				al3.setLibros(l1);
				
				AutorLibro al4 =new AutorLibro();
					LibroT l2 = new LibroT();
					l2.setTitulo("La vuelta al mundo en 80 dias");
					l2.setPaginas(339);
				al3.setAutores(autor);
				al3.setLibros(l2);
				
			Set<AutorLibro> lista2 = new HashSet<>();
			lista2.add(al3);
			lista2.add(al4);
			
		autor.setAutoresLibrosA(lista2);
		
		this.iLibroService.insertarLibro(l1);
		this.iLibroService.insertarLibro(l2);
		this.autorService.insertarAutor(autor);
		
	}
}
