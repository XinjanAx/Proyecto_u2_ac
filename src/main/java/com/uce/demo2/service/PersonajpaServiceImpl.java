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
		return this.iPersonajpaRepository.buscarTodos();
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
	
	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorNombre(nombre);
	}
	
	@Override
	public int actualizarPorApellido(String Apellido, String genero) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.actualizarPorApellido(Apellido, genero);
	}

	@Override
	public int eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.eliminarPorGenero(genero);
	}

	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorCedulaTyped(cedula);
	}

	@Override
	public Persona buscarPorCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorCedulaNamed(cedula);
	}

	@Override
	public Persona buscarPorCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorCedulaTypedNamed(cedula);
	}

	@Override
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorNombreApellido(nombre, apellido);
	}

	@Override
	public Persona buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorCedulaNamed(cedula);
	}

	@Override
	public Persona buscarPorCedulaNamedNative(String cedula) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorCedulaNamedNative(cedula);
	}

	@Override
	public Persona buscarPorCedulaCriteriaApi(String cedila) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.buscarPorCedulaCriteriaApi(cedila);
	}

	@Override
	public List<Persona>  busquedaDinamica(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		return this.iPersonajpaRepository.busquedaDinamica(nombre, apellido, genero);
	}



}
