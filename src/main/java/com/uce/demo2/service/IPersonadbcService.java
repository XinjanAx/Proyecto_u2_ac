package com.uce.demo2.service;

import com.uce.demo2.to.Persona;

public interface IPersonadbcService {
	
	public void guardar (Persona persona);
	public Persona buscarPorId (int cid);
	public void actualizar(Persona persona);
	public void eliminar (int id);
}
