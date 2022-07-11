package com.uce.demo2.tarea16.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.demo2.tarea16.modelo.Propietario;


@Repository
@Transactional
public class PropietarioJpaRepositoryImpl implements IPropietarioRepository {

	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@PersistenceContext
	private EntityManager entityManager; 
	
	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		this.entityManager.persist(p);
		Log.info("Se incerto un propietario...");
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = this.consultar(cedula);
		this.entityManager.remove(p);
		Log.info("Se elimino el propietario.");
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Query JpqlQuery = this.entityManager.createQuery("SELECT p FROM Propietario p WHERE p.cedula= :datoCedula");
        JpqlQuery.setParameter("datoCedula", cedula);
        Log.info("Se ecnontro un propietarios con ci:" + cedula);
        return (Propietario) JpqlQuery.getSingleResult();
	}



}
