package com.uce.demo2.tarea22.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.modelo.Persona;
import com.uce.demo2.tarea22.modelo.Ciudadano22;


@Repository
@Transactional
public class Ciudadano22JpaRepositoryImpl implements ICiudadano22JpaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Ciudadano22 cuidadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuidadano);
	}

	@Override
	public Ciudadano22 buscar(String cedula) {
		// TODO Auto-generated method stub
		Query myTypedQuery = this.entityManager
				.createQuery("SELECT c FROM Ciudadano22 c WHERE c.cedula = :datoCedula");
		myTypedQuery.setParameter("datoCedula", cedula);
		return (Ciudadano22) myTypedQuery.getSingleResult();
	}

	@Override
	public void actualizar(Ciudadano22 cuidadano) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuidadano);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Ciudadano22 c = this.buscar(cedula);
		this.entityManager.refresh(c);
		}

}
