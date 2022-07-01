package com.uce.demo2.colegio.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.colegio.modelo.Estudiante;

@Repository
@Transactional
public class EstrudianteJPARepositoryImpl implements IEstudianteJPARepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la base de datos...");
		
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la base de datos...");
	
		return this.entityManager.find(Estudiante.class, id);

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la base de datos...");
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la base de datos...");
		Estudiante e = this.buscarPorId(id);	
		
		this.entityManager.remove(e);
	}
}
