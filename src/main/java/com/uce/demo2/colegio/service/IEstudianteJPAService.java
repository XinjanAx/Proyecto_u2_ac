package com.uce.demo2.colegio.service;

import java.util.List;

import com.uce.demo2.colegio.modelo.EstudianteGroupGratuidad;
import com.uce.demo2.colegio.modelo.EstudianteSencillo;


public interface IEstudianteJPAService {
	
	public EstudianteSencillo BusquedaCiGratuidad(String cedula);
	public List<EstudianteGroupGratuidad> cantidadGratuitos();

	
}
