package com.uce.demo2.tarea23.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.tarea23.modelo.Pais;
import com.uce.demo2.tarea23.repository.IPaisRepository;

@Service
public class PaisServiceImpl implements IPaisService{

	@Autowired
	private IPaisRepository iPaisRepository;
	
	@Override
	public void insertar(Pais pais) {
		System.out.println("Conectando a la DB...");
		this.iPaisRepository.insertar(pais);
	}

	@Override
	public Pais buscarPorNombre(String nombre) {
		System.out.println("Conectando a la DB...");
		return this.iPaisRepository.buscarPorNombre(nombre);
	}

	@Override
	public void actualizar(Pais pais) {
		System.out.println("Conectando a la DB...");
		this.iPaisRepository.actualizar(pais);
	}

	@Override
    public void eliminarPorNombre (String nombre){
		System.out.println("Conectando a la DB...");
		this.iPaisRepository.eliminarPorNombre(nombre);
	}

}
