package com.uce.demo2.repository;

import java.util.List;

import com.uce.demo2.to.PersonaTo;

public interface IPersonadbcRepository {
	
	public List <PersonaTo> buscarTodos();
	public PersonaTo buscarPorId (int id);
    public void insertar (PersonaTo persona);
    public void actualizar (PersonaTo persona);
    public void eliminar (int id);
}
