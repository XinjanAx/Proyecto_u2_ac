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
    public Persona buscarPorCedulaTyped (String cedula);
    public Persona buscarPorCedulaNamed (String cedula);
    public Persona buscarPorCedulaTypedNamed(String cedula);
     
    public List<Persona> buscarPorApellido (String apellido);
    public List<Persona> buscarPorGenero (String genero);
    public List<Persona> buscarPorNombre(String nombre);
    
    public List<Persona> buscarPorNombreApellido(String nombre,String apellido);
    
    public int actualizarPorApellido (String Apellido,String genero);
    public int eliminarPorGenero (String genero);
}
