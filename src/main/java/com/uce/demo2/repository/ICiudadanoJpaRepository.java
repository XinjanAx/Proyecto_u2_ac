package com.uce.demo2.repository;

import com.uce.demo2.modelo.onetoone.Ciudadano;

public interface ICiudadanoJpaRepository {
	
	public Ciudadano buscarPorId(Integer id);
	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public void eliminar(Integer id);
}
