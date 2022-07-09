package com.uce.demo2.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.modelo.Persona;

@Repository
@Transactional
public class PersonajpaRepositoryImpl implements IPersonajpaRepository{
	
	@PersistenceContext
	private EntityManager entityManager; 
	
	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Persona p = this.buscarPorId(id);
		this.entityManager.remove(p);
		
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula = :VarCedula");
		jpqlQuery.setParameter("VarCedula", cedula);
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.apellido = :datoApellido");
        myQuery.setParameter("datoApellido", apellido);
        return myQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		Query myQuery2 = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.genero = :datoGenero");
        myQuery2.setParameter("datoGenero", genero);
        return myQuery2.getResultList();
	}

    @Override
    public List<Persona> buscarPorNombre(String nombre) {
        Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.nombre= :datonombre");
        myQuery.setParameter("datonombre", nombre); //reemplaza datoapellido por el apellido del parametro

        return myQuery.getResultList();
    }
	
	
	
	@Override
	public int actualizarPorApellido(String apellido,String genero) {

		Query myQuery = this.entityManager.createQuery("UPDATE Persona p SET p.genero = :datoGenero WHERE p.apellido = :datoApellido ");
		myQuery.setParameter("datoGenero", genero);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.executeUpdate();
	}

	@Override
	public int eliminarPorGenero(String genero) {
		Query myQuery = this.entityManager.createQuery("DELETE FROM Persona p	WHERE p.genero = :datoGenero");
		myQuery.setParameter("datoGenero", genero);
		return myQuery.executeUpdate();
	}



}
