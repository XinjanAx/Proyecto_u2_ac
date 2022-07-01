package com.uce.demo2.service;

import java.util.List;

import com.uce.demo2.to.PersonaTo;

public interface IPersonadbcService {
	
	public void guardar (PersonaTo persona);
	public PersonaTo buscarPorId (int cid);
	public void actualizar(PersonaTo persona);
	public void eliminar (int id);
	public List <PersonaTo> buscarTodos();

}
