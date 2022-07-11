package com.uce.demo2.tarea16.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.tarea16.modelo.Matricula;

@Repository
@Transactional
public class MatriculaJpaRepositoryImpl implements IMatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager; 
	
	@Override
	public void crear(Matricula m) {
		// TODO Auto-generated method stub
		this.entityManager.persist(m);
	}

	

}
