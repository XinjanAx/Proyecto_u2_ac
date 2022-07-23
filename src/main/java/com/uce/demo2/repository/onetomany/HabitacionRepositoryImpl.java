package com.uce.demo2.repository.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.modelo.onetomany.Habitacion;

@Repository
@Transactional
public class HabitacionRepositoryImpl implements IHabitacionRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Habitacion habictacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habictacion);
	}

}
