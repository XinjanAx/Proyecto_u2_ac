package com.uce.demo2.tarea24.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.tarea24.modelo.LibroT;


@Repository
@Transactional
public class LibroTRepositoryImpl implements ILibroTRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarLibro(LibroT libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

}
