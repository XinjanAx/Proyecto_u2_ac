package com.uce.demo2.service;

import java.util.List;

import com.uce.demo2.modelo.Persona;

public interface IPersonajpaService {

	public void guardar (Persona persona);
	public Persona buscarPorId (Integer id);
	public void actualizar(Persona persona);
	public void eliminar (Integer id);
	public List <Persona> buscarTodos();
}
