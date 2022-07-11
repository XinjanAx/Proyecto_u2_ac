package com.uce.demo2.tarea16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.tarea16.modelo.Propietario;
import com.uce.demo2.tarea16.repository.IPropietarioRepository;

@Service
public class PropietarioJpaServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(cedula);
		
	}
}
