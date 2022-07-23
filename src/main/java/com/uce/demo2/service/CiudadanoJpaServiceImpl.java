package com.uce.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.modelo.onetoone.Ciudadano;
import com.uce.demo2.repository.ICiudadanoJpaRepository;

@Service
public class CiudadanoJpaServiceImpl implements ICiudadanoJpaService{
	
	@Autowired
	private ICiudadanoJpaRepository ciudadanoJpaRepository;
	
	@Override
	public Ciudadano buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoJpaRepository.buscarPorId(id);
	}

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la DB...");
		this.ciudadanoJpaRepository.insertar(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoJpaRepository.actualizar(ciudadano);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoJpaRepository.eliminar(id);
	}

}
