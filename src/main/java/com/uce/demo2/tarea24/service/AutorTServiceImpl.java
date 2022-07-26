package com.uce.demo2.tarea24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uce.demo2.tarea24.modelo.AutorT;
import com.uce.demo2.tarea24.repository.IAutorTRepository;

@Service
public class AutorTServiceImpl implements IAutorTService{
	@Autowired
	private IAutorTRepository autorTRepository;
	
	@Override
	public void insertarAutor(AutorT autor) {
		// TODO Auto-generated method stub
		this.autorTRepository.insertarAutor(autor);
	}

}
