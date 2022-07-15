package com.uce.demo2.colegio.service;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.colegio.modelo.Estudiante;
import com.uce.demo2.colegio.repository.IEstudianteJPARepository;


@Service
public class EstrudianteJPAServiceImpl implements IEstudianteJPAService{

	@Autowired
	private IEstudianteJPARepository estudianteRepository;
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	
	@Override
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");
		this.estudianteRepository.ingresar(estudiante);
		
	}

	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");
		return this.estudianteRepository.buscarPorId(id);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");
		this.estudianteRepository.eliminar(id);
	}
	
	@Override
	public Estudiante buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");

		return this.estudianteRepository.buscarPorCedulaNative(cedula);
	}

	@Override
	public List<Estudiante> listaEstudiantesGratuitosNative() {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");

		return this.estudianteRepository.listaEstudiantesGratuitosNative();
	}
	
	@Override
	public List<Estudiante> listaEdadesDecendentesNamedNative() {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");
		return this.estudianteRepository.listaEdadesDecendentesNamedNative();
	}

	@Override
	public List<Estudiante> listaEstudiantesGratuitosMenoresANamedNative(Integer edad) {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");
		return this.estudianteRepository.listaEstudiantesGratuitosMenoresANamedNative(edad);
	}



}
