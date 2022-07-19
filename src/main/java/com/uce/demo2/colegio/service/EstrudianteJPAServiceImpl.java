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
	public List<Estudiante> busquedaDinamicaGratuidad(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		Log.info("\nConectando a la base de datos...");
		return null;
	}



}
