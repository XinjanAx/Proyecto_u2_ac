package com.uce.demo2.repository;

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

import com.uce.demo2.modelo.Persona;

@Repository
@Transactional
public class PersonajpaRepositoryImpl implements IPersonajpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

//no se puede usar con un id generado en la DB
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

//no se puede usar con un id generado en la DB
	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

//no se puede usar con un id generado en la DB
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Persona p = this.buscarPorId(id);
		this.entityManager.remove(p);

	}

	@Override
	public int actualizarPorApellido(String apellido, String genero) {

		Query myQuery = this.entityManager
				.createQuery("UPDATE Persona p SET p.genero = :datoGenero WHERE p.apellido = :datoApellido ");
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

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	@Override
	public Persona buscarPorCedula(String cedula) {
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula = :VarCedula");
		jpqlQuery.setParameter("VarCedula", cedula);
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		TypedQuery<Persona> myTypedQuery = this.entityManager
				.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula", Persona.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNamed(String cedula) {

		Query myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula");// namedQuiery q trabaja con un
																						// Query
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTypedNamed(String cedula) {// combinacion de los 2
		TypedQuery<Persona> myTypedQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula",
				Persona.class);
		myTypedQuery.setParameter("datoCedula", cedula);
		return myTypedQuery.getSingleResult();
	}

//------------------------------------------------------------------------------------------

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
		myQuery.setParameter("datonombre", nombre); // reemplaza datoapellido por el apellido del parametro
		return myQuery.getResultList();
	}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
		TypedQuery<Persona> myTypedQuery = this.entityManager.createNamedQuery("Persona.buscarPorNombreApellido",
				Persona.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		myTypedQuery.setParameter("datoApellido", apellido);
		return myTypedQuery.getResultList();
	}
//-----------------------------------------------------------
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	@Override
	public Persona buscarPorCedulaNative(String cedula) { // el SQL directo q va a la base de datos
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM persona  WHERE pers_cedula = :datoCedula",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	} // -------------ojo con los create del entityManager-------

	@Override
	public Persona buscarPorCedulaNamedNative(String cedula) {
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedulaNativa",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaCriteriaApi(String cedula) {
		// crear el contructor
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Persona> myQuery = myBuilder.createQuery(Persona.class);

		// Root FROM

		Root<Persona> personaRoot = myQuery.from(Persona.class);

		myQuery.select(personaRoot).where(myBuilder.equal(personaRoot.get("cedula"), cedula));

		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);
		return myQueryFinal.getSingleResult();
	}

	@Override
	public List<Persona> busquedaDinamica(String nombre, String apellido, String genero) {
		
	    CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
	    CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);
	    Root<Persona> myTable= myQuery.from(Persona.class);
	    Predicate predicateNombre = myCriteria.equal(myTable.get("nombre"), nombre);// (nombre de la entidad, nombre de parametro)
	    Predicate predicateApellido = myCriteria.equal(myTable.get("apellido"), apellido);// (nombre de la entidad, nombre de parametro)
	    Predicate predicateGenero = myCriteria.equal(myTable.get("genero"), genero);// (nombre de la entidad, nombre de parametro)

	    //pers_nombre='diana' and pers_apellido='Muñoz'
	    Predicate myPredicateFinal =null;

	    if ( genero.equals("M")) {
	        //Predicate predicateFecha = myCriteria.equal(myTable.get("cedula"),"cedula"); como ejemplso se puede añadir mas condiciones despues
	        myPredicateFinal = myCriteria.or(predicateNombre,predicateApellido);
	        myPredicateFinal = myCriteria.and(myPredicateFinal,predicateGenero);
	    }else if (genero.equals("F")) {
	        myPredicateFinal = myCriteria.and(predicateNombre,predicateApellido);
	        myPredicateFinal = myCriteria.or(myPredicateFinal,predicateGenero);

	    }

	    myQuery.select(myTable).where(myPredicateFinal);
	    TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);

	    return myQueryFinal.getResultList();
	    }

}
