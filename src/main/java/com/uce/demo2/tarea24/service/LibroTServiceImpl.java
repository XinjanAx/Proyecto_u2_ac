package com.uce.demo2.tarea24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uce.demo2.tarea24.modelo.LibroT;
import com.uce.demo2.tarea24.repository.ILibroTRepository;

@Service
public class LibroTServiceImpl implements ILibroTService{

	@Autowired
	private ILibroTRepository iLibroTRepository;
	@Override
	public void insertarLibro(LibroT libro) {
		// TODO Auto-generated method stub
		this.iLibroTRepository.insertarLibro(libro);
	}

}
