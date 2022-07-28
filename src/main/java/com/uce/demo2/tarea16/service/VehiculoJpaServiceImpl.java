package com.uce.demo2.tarea16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.tarea16.modelo.Vehiculo;
import com.uce.demo2.tarea16.repository.IVehiculoRepository;

@Service
public class VehiculoJpaServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(placa);
		
	}

	@Override
	public void actializar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actializar(vehiculo);
		
	}
}
