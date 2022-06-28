package com.uce.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.repository.IPersonadbcRepository;
import com.uce.demo2.to.Persona;

@Service
public class PersonadbcServiceIpml implements IPersonadbcService {
	
	@Autowired
	private IPersonadbcRepository iPeronaRepository;
	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPeronaRepository.insertar(persona);
	}
	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPeronaRepository.actualizar(persona);
	}
	@Override
	public Persona buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.iPeronaRepository.buscarPorId(id);
	}
	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.iPeronaRepository.eliminar(id);
	}
	
}
