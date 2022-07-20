package com.uce.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.modelo.Empleado;
import com.uce.demo2.repository.IEmpleadoJpaRepository;

@Service
public class EmpleadoJpaServiceImpl implements IEmpleadoJpaService{

	
	@Autowired
	private IEmpleadoJpaRepository empleadoJpaRepository;
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoJpaRepository.insertar(empleado);
	}

}
