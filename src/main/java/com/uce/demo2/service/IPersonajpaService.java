package com.uce.demo2.service;

import java.util.List;

import com.uce.demo2.modelo.Persona;

public interface IPersonajpaService {

	public void guardar (Persona persona);
	public Persona buscarPorId (Integer id);
	public void actualizar(Persona persona);
	public void eliminar (Integer id);
	public List <Persona> buscarTodos();
	
    public Persona buscarPorCedula (String cedula);
    public Persona buscarPorCedulaTyped (String cedula);
    public Persona buscarPorCedulaNamed (String cedula);
    public Persona buscarPorCedulaTypedNamed(String cedula);
	
	public List<Persona> buscarPorNombre(String nombre);
    public List<Persona> buscarPorApellido (String apellido);
    
    public List<Persona> buscarPorNombreApellido(String nombre,String apellido);

    
    public List<Persona> buscarPorGenero (String genero);
    
    public int actualizarPorApellido (String Apellido,String genero);
    public int eliminarPorGenero (String genero);
    
    public Persona buscarPorCedulaNative(String cedula);
    public Persona buscarPorCedulaNamedNative(String cedula);

    public Persona buscarPorCedulaCriteriaApi(String cedila);
    public List<Persona>  busquedaDinamica(String nombre,String apellido, String genero);

}
