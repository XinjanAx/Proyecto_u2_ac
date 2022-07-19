package com.uce.demo2.colegio.repository;

import java.util.List;

import com.uce.demo2.colegio.modelo.EstudianteGroupGratuidad;
import com.uce.demo2.colegio.modelo.EstudianteSencillo;


public interface IEstudianteJPARepository {
	
	public EstudianteSencillo busquedaCiGratuidad(String cedula);
	public List<EstudianteGroupGratuidad> cantidadGratuitos();
	   
}
