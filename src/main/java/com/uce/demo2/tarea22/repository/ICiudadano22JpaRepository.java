package com.uce.demo2.tarea22.repository;

import com.uce.demo2.tarea22.modelo.Ciudadano22;

public interface ICiudadano22JpaRepository {
	
	public void insertar (Ciudadano22 cuidadano);
    public Ciudadano22 buscar (String cedula);
    public void actualizar (Ciudadano22 cuidadano);
    public void eliminar (String cedula);

}
