package com.uce.demo2.tarea23.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.tarea23.modelo.Ciudad;

@Repository
@Transactional
public class CiudadRepositoryImpl implements ICiudadRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Ciudad ciudad) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudad);
	}

	@Override
	public Ciudad buscarPorNombre(String nombre) {
		Query myQuery = this.entityManager
				.createQuery("SELECT c FROM Ciudad c WHERE c.nombre = :datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Ciudad) myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Ciudad ciudad) {
		// TODO Auto-generated method stub
		Ciudad c = this.buscarPorNombre(ciudad.getNombre());
		this.entityManager.merge(c.getId());
	}

	@Override
	public void eliminarPorNombre (String nombre) {
		// TODO Auto-generated method stub
		Ciudad c = this.buscarPorNombre(nombre);
		this.entityManager.refresh(c);
	}

}
