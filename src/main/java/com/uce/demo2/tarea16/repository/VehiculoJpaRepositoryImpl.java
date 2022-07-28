package com.uce.demo2.tarea16.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.demo2.tarea16.modelo.Vehiculo;


@Repository
@Transactional
public class VehiculoJpaRepositoryImpl implements IVehiculoRepository{

	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	@PersistenceContext
	private EntityManager entityManager; 
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
		Log.info("\nSe inserto  un veiculo...");	
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Log.info("\nSe ecnontro un veiculos de placa: " + placa);		
		Query jpqlQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.placa = :datoPlaca");
		jpqlQuery.setParameter("datoPlaca", placa);
		return (Vehiculo) jpqlQuery.getSingleResult();
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo v = this.buscar(placa);
		this.entityManager.remove(v);
		Log.info("\nSe elimino el vehiculos de placa: " + placa);
	}

	@Override
	public void actializar(Vehiculo v) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createQuery("UPDATE Vehiculo v SET v.tipo = :datoTipo, v.modelo=:datoModelo, v.marca = :datoMarca, v.precio = :datoPrecio WHERE v.placa = :datoPlaca");
        myQuery.setParameter("datoTipo", v.getTipo());
        myQuery.setParameter("datoModelo", v.getModelo());
        myQuery.setParameter("datoMarca", v.getMarca());
        myQuery.setParameter("datoPrecio",v.getPrecio());
        myQuery.setParameter("datoPlaca", v.getPlaca());
        myQuery.executeUpdate();
        Log.info("\nSe actualizo el veiculo: " + v.getPlaca());
         
	}

	

}
