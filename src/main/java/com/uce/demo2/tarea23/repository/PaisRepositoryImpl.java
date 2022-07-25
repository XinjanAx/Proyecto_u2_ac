package com.uce.demo2.tarea23.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.tarea23.modelo.Pais;

@Repository
@Transactional
public class PaisRepositoryImpl implements IPaisRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Pais pais) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pais);
	}

	@Override
	public Pais buscarPorNombre(String nombre) {
		Query myQuery = this.entityManager
				.createQuery("SELECT p FROM Pais p WHERE p.nombre = :datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Pais) myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Pais pais) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pais);
	}

	@Override
	public void eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Pais p = this.buscarPorNombre(nombre);
		this.entityManager.refresh(p);
	}

}
