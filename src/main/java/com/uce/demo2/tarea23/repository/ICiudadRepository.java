package com.uce.demo2.tarea23.repository;

import com.uce.demo2.tarea23.modelo.Ciudad;

public interface ICiudadRepository {
	
	public void insertar (Ciudad ciudad);
	public Ciudad buscarPorNombre (String nombre);
    public void actualizar (Ciudad ciudad);
    public void eliminarPorNombre (String nombre);

}
