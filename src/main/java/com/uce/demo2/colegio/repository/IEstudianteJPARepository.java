package com.uce.demo2.colegio.repository;

import java.util.List;

import com.uce.demo2.colegio.modelo.Estudiante;

public interface IEstudianteJPARepository {
	
	public List<Estudiante> busquedaDinamicaGratuidad(String nombre, String apellido, String genero);
	   
}
