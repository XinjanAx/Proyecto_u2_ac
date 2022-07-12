package com.uce.demo2.colegio.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
		
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante e = this.buscarPorId(id);	
		
		this.entityManager.remove(e);
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		Query myQuery =this.entityManager.createNamedQuery("Estudiante.buscarPorCedula");
		myQuery.setParameter("datoCedula", cedula);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> listaEdadesDecendentes() {
		Query myQuery =this.entityManager.createNamedQuery("Estudiante.edadesDecendentes");
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> listaEstudiantesGratuitos() {
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.gratuidad = true",Estudiante.class);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellido(String nombre, String apellido) {
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.apellido = :datoApellido",Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorCedulaTypedNamed(String cedula) {
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorCedula",Estudiante.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> listaEstudiantesGratuitosMenoresA(Integer edad) {
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.gratuidadPorEdadesMenoresA",Estudiante.class);
		myTypedQuery.setParameter("datoEdad", edad);
		return myTypedQuery.getResultList();
	}
	
	
}
