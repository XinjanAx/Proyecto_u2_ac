package com.uce.demo2.colegio.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.colegio.modelo.Estudiante;
import com.uce.demo2.colegio.repository.IEstudianteJPARepository;

@Service
public class EstrudianteJPAServiceImpl implements IEstudianteJPAService{

	@Autowired
	private IEstudianteJPARepository estudianteRepository;
	
	@Override
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
		this.estudianteRepository.ingresar(estudiante);
		System.out.println("Se ingreso el Estudiante: " + estudiante);
	}

	@Override
	public Estudiante buscarPorId(Integer id) {
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
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(id);
		System.out.println("Se elimino el Estudiante: " +id);
	}

}
