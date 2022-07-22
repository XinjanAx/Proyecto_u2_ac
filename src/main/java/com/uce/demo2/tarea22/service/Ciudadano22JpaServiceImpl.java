package com.uce.demo2.tarea22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.tarea22.modelo.Ciudadano22;
import com.uce.demo2.tarea22.repository.ICiudadano22JpaRepository;

@Service
public class Ciudadano22JpaServiceImpl implements ICiudadano22JpaService{
	
	@Autowired
	private ICiudadano22JpaRepository ciudadano22JpaRepository;

	@Override
	public void insertar(Ciudadano22 cuidadano) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la DB...");
		this.ciudadano22JpaRepository.insertar(cuidadano);
	}

	@Override
	public Ciudadano22 buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la DB...");
		return this.ciudadano22JpaRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Ciudadano22 cuidadano) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la DB...");
		this.ciudadano22JpaRepository.actualizar(cuidadano);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la DB...");
		this.ciudadano22JpaRepository.eliminar(cedula);
	}

}
