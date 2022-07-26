package com.uce.demo2.repository.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.modelo.manytomany.Autor;

@Repository
@Transactional
public class AutorRepositoryImpl implements IAutorRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void incertarA(Autor autor) {
		// TODO Auto-generated method stub
		
	}

}
