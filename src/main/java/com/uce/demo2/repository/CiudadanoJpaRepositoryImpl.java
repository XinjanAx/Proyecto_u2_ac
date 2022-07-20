package com.uce.demo2.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.modelo.Ciudadano;


@Repository
@Transactional
public class CiudadanoJpaRepositoryImpl implements ICiudadanoJpaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Ciudadano buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudadano);
	}

//no se puede usar con un id generado en la DB
	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudadano);
	}

//no se puede usar con un id generado en la DB
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudadano p = this.buscarPorId(id);
		this.entityManager.remove(p);

	}

}
