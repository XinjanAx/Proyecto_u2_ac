package com.uce.demo2.tarea24.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.tarea24.modelo.AutorT;


@Repository
@Transactional
public class AutorTRepositoryImpl implements IAutorTRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarAutor(AutorT autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);
	}

}
