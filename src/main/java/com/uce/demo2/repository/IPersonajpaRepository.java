package com.uce.demo2.repository;

import java.util.List;

import com.uce.demo2.modelo.Persona;
import com.uce.demo2.modelo.PersonaContadorGenero;
import com.uce.demo2.modelo.PersonaSencilla;


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
    
    public Persona buscarPorCedulaNative(String cedula);
    public Persona buscarPorCedulaNamedNative(String cedula);
    
    public Persona buscarPorCedulaCriteriaApi(String cedila); 
    public List<Persona> busquedaDinamica(String nombre,String apellido, String genero);

    public List<PersonaSencilla> buscarPorApellidoPersonaS (String apellido);
	public List<PersonaContadorGenero> buscarCantidadPorGenero();

}
