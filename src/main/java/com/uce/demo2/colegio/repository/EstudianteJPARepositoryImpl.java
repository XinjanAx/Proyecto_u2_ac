package com.uce.demo2.colegio.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.colegio.modelo.Estudiante;
import com.uce.demo2.modelo.Persona;


@Repository
@Transactional
public class EstudianteJPARepositoryImpl implements IEstudianteJPARepository{
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Estudiante> busquedaDinamicaGratuidad(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		return null;
	}	
}
