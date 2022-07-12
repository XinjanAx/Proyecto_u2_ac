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
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorCedula(cedula);
	}

	@Override
	public List<Estudiante> listaEdadesDecendentes() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.listaEdadesDecendentes();
	}

	@Override
	public List<Estudiante> listaEstudiantesGratuitos() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.listaEstudiantesGratuitos();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorNombreApellido(nombre, apellido);
	}

	@Override
	public Estudiante buscarPorCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorCedulaTypedNamed(cedula);
	}

	@Override
	public List<Estudiante> listaEstudiantesGratuitosMenoresA(Integer edad) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.listaEstudiantesGratuitosMenoresA(edad);
	}

}
