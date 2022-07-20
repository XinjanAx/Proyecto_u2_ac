package com.uce.demo2.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.modelo.Empleado;

@Repository
@Transactional
public class EmpleadoJpaRepositoryImpl implements IEmpleadoJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}

}
