package com.uce.demo2.colegio.service;

import java.util.List;

import com.uce.demo2.colegio.modelo.Estudiante;
import com.uce.demo2.modelo.Persona;

public interface IEstudianteJPAService {
	
	public void ingresar (Estudiante estudiante);
	public Estudiante buscarPorId (Integer id);
	public void actualizar(Estudiante estudiante);
	public void eliminar (Integer id);
	
	public Estudiante buscarPorCedulaNative(String cedula);
	public List<Estudiante> listaEstudiantesGratuitosNative();
	
	public List<Estudiante> listaEdadesDecendentesNamedNative();
	public List<Estudiante> listaEstudiantesGratuitosMenoresANamedNative(Integer edad);

	
	
}
