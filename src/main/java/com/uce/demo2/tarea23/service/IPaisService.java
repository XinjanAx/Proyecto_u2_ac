package com.uce.demo2.tarea23.service;

import com.uce.demo2.tarea23.modelo.Pais;

public interface IPaisService {
	
	public void insertar (Pais pais);
	public Pais buscarPorNombre (String nombre);
    public void actualizar (Pais pais);
    public void eliminarPorNombre (String nombre);

}
