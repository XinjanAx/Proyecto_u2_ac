package com.uce.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.modelo.Persona;
import com.uce.demo2.repository.IPersonajpaRepository;

@Service
public class PersonajpaServiceImpl implements IPersonajpaService{

	@Autowired
	private IPersonajpaRepository iPersonajpaRepository;
	
	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonajpaRepository.insertar(persona);
	}

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorId(id);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonajpaRepository.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPersonajpaRepository.eliminar(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorCedula(cedula);
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorApellido(apellido);
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorGenero(genero);
	}

}
