package com.uce.demo3.colegio.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo3.colegio.repository.IEstudianteRepository;
import com.uce.demo3.colegio.to.Estudiante;

@Service
public class EstrudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Override
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
		this.estudianteRepository.ingresar(estudiante);
		System.out.println("Se ingreso el Estudiante: " + estudiante);
	}

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		System.out.println("Se encontro el Estudiante: " +id);
		return this.estudianteRepository.buscarPorId(id);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
		System.out.println("Se ingreso el Estudiante: " + estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(id);
		System.out.println("Se elimino el Estudiante: " +id);
	}

}
