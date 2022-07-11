package com.uce.demo2.tarea16.repository;

import com.uce.demo2.tarea16.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void insertar(Vehiculo vehiculo);
	public Vehiculo buscar (String placa);
	public void eliminar (String placa);
	public void actializar (Vehiculo vehiculo);
	
}
