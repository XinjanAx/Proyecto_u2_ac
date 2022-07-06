package com.uce.demo2.repository;

import java.util.List;

import com.uce.demo2.modelo.Persona;
import com.uce.demo2.to.PersonaTo;

public interface IPersonajpaRepository {
	
	
	public List <Persona> buscarTodos();
	public Persona buscarPorId (Integer id);
    public void insertar (Persona persona);
    public void actualizar (Persona persona);
    public void eliminar (Integer id);
    public Persona buscarPorCedula (String cedula);
    public List<Persona> buscarPorApellido (String apellido);
    public List<Persona> buscarPorGenero (String genero);
}
