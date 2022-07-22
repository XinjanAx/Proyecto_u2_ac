package com.uce.demo2.tarea22.service;

import com.uce.demo2.tarea22.modelo.Ciudadano22;

public interface ICiudadano22JpaService {
	
	public void insertar (Ciudadano22 cuidadano);
    public Ciudadano22 buscar (String cedula);
    public void actualizar (Ciudadano22 cuidadano);
    public void eliminar (String cedula);

}
