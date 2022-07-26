package com.uce.demo2.service.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.modelo.manytomany.Libro;
import com.uce.demo2.repository.manytomany.ILibroRepository;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepository iLibroRepository;
	
	@Override
	public void incertarL(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.incertarL(libro);
	}
}
