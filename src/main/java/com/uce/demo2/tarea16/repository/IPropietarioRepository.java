package com.uce.demo2.tarea16.repository;

import com.uce.demo2.tarea16.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void insertar (Propietario p);
	public void eliminar (String cedula);
	public Propietario consultar(String cedula);
}
