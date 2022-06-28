package com.uce.demo2.repository;

import com.uce.demo2.to.Persona;

public interface IPersonadbcRepository {
	
	public Persona buscarPorId (int id);
    public void insertar (Persona persona);
    public void actualizar (Persona persona);
    public void eliminar (int id);
}
