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
public class EstudianteJPARepositoryImpl implements IEstudianteJPARepository{
	
	
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

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public Estudiante buscarPorCedulaNative(String cedula) {
		Query myQuery =this.entityManager.createNativeQuery("SELECT * FROM estudiante where est_cedula = :datoCedula",Estudiante.class);
		myQuery.setParameter("datoCedula", cedula);//-------
		return (Estudiante) myQuery.getSingleResult();
	}
	
	@Override
	public List<Estudiante> listaEstudiantesGratuitosNative() {
		Query myTypedQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE est_gratuidad = true",Estudiante.class);
		return myTypedQuery.getResultList();                   //-----------
	}
	@Override
	public List<Estudiante> listaEdadesDecendentesNamedNative() {
		Query myQuery =this.entityManager.createNativeQuery("Estudiante.edadesDecendentes",Estudiante.class);
		return myQuery.getResultList();   //---------------
	}

	@Override
	public List<Estudiante> listaEstudiantesGratuitosMenoresANamedNative(Integer edad) {
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.gratuidadPorEdadesMenoresA",Estudiante.class);
		myTypedQuery.setParameter("datoEdad", edad);           //---------------
		return myTypedQuery.getResultList();
	}
//----------------------------------------------------------------------------------
	
}
