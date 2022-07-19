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
import com.uce.demo2.colegio.modelo.EstudianteGroupGratuidad;
import com.uce.demo2.colegio.modelo.EstudianteSencillo;
import com.uce.demo2.modelo.Persona;
import com.uce.demo2.modelo.PersonaContadorGenero;
import com.uce.demo2.modelo.PersonaSencilla;


@Repository
@Transactional
public class EstudianteJPARepositoryImpl implements IEstudianteJPARepository{
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public EstudianteSencillo busquedaCiGratuidad(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteSencillo> myQuery = this.entityManager.createQuery(
							"SELECT NEW com.uce.demo2.colegio.modelo.EstudianteSencillo(e.cedula, e.gratuidad) FROM Estudiante e WHERE e.cedula = :datoCedula",EstudianteSencillo.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}


	@Override
	public List<EstudianteGroupGratuidad> cantidadGratuitos() {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteGroupGratuidad> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.demo2.colegio.modelo.EstudianteGroupGratuidad(e.gratuidad, COUNT(e.gratuidad)) FROM Estudiante e GROUP BY e.gratuidad",EstudianteGroupGratuidad.class);
		return myQuery.getResultList();
	}
	
	
}
