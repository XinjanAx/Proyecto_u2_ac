package com.uce.demo2.colegio.repository;

import java.util.List;

import com.uce.demo2.colegio.modelo.Estudiante;




public interface IEstudianteJPARepository {
	
	public void ingresar (Estudiante estudiante);
	public Estudiante buscarPorId (Integer id);
	public void actualizar(Estudiante estudiante);
	public void eliminar (Integer id);
	
	public Estudiante buscarPorCedulaNative(String cedula);
	public List<Estudiante> listaEstudiantesGratuitosNative();
	
	public List<Estudiante> listaEdadesDecendentesNamedNative();
	public List<Estudiante> listaEstudiantesGratuitosMenoresANamedNative(Integer edad);
	   
}
