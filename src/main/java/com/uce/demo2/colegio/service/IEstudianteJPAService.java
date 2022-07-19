package com.uce.demo2.colegio.service;

import java.util.List;

import com.uce.demo2.colegio.modelo.Estudiante;
import com.uce.demo2.modelo.Persona;

public interface IEstudianteJPAService {
	
	public List<Estudiante> busquedaDinamicaGratuidad(String nombre, String apellido, String genero);

	
}
