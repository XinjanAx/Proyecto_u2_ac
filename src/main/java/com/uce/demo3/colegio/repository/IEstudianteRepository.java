package com.uce.demo3.colegio.repository;

import com.uce.demo3.colegio.to.Estudiante;

public interface IEstudianteRepository {
	public void ingresar (Estudiante estudiante);
	public Estudiante buscarPorId (int id);
	public void actualizar(Estudiante estudiante);
	public void eliminar (int id);

}
