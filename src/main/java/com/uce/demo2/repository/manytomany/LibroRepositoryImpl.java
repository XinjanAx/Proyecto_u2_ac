package com.uce.demo2.repository.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.modelo.manytomany.Libro;

@Repository
@Transactional
public class LibroRepositoryImpl implements ILibroRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void incertarL(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}
	
}
