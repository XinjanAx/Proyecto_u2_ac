package com.uce.demo2.colegio.service;

import com.uce.demo2.colegio.modelo.Estudiante;

public interface IEstudianteJPAService {
	
	public void ingresar (Estudiante estudiante);
	public Estudiante buscarPorId (Integer id);
	public void actualizar(Estudiante estudiante);
	public void eliminar (Integer id);

}
