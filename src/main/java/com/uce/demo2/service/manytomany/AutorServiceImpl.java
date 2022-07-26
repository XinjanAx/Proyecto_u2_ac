package com.uce.demo2.service.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.modelo.manytomany.Autor;
import com.uce.demo2.repository.manytomany.IAutorRepository;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IAutorRepository autorRepository;
	@Override
	public void incertarA(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepository.incertarA(autor);
	}

}
