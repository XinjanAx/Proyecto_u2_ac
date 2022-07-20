package com.uce.demo2.service;

import com.uce.demo2.modelo.Ciudadano;

public interface ICiudadanoJpaService {
	
	public Ciudadano buscarPorId(Integer id);
	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public void eliminar(Integer id);

}
