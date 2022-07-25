package com.uce.demo2.tarea23.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.tarea23.modelo.Ciudad;
import com.uce.demo2.tarea23.repository.ICiudadRepository;

@Service
public class CiudadServiceImpl implements ICiudadService{

	@Autowired
	private ICiudadRepository ciudadRepository;
	
	@Override
	public void insertar(Ciudad ciudad) {
		System.out.println("Conectando a la DB...");
		this.ciudadRepository.insertar(ciudad);
	}

	@Override
	public Ciudad buscarPorNombre(String nombre) {
		System.out.println("Conectando a la DB...");
		return this.ciudadRepository.buscarPorNombre(nombre);
	}

	@Override
	public void actualizar(Ciudad ciudad) {
		System.out.println("Conectando a la DB...");
		this.ciudadRepository.actualizar(ciudad);
	}

	@Override
	public void eliminarPorNombre (String nombre) {
		System.out.println("Conectando a la DB...");
		this.ciudadRepository.eliminarPorNombre (nombre);
	}
}
