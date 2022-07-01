package com.uce.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.repository.IPersonadbcRepository;
import com.uce.demo2.to.PersonaTo;

@Service
public class PersonadbcServiceIpml implements IPersonadbcService {
	
	@Autowired
	private IPersonadbcRepository iPeronaRepository;
	@Override
	public void guardar(PersonaTo persona) {
		// TODO Auto-generated method stub
		this.iPeronaRepository.insertar(persona);
	}
	@Override
	public void actualizar(PersonaTo persona) {
		// TODO Auto-generated method stub
		this.iPeronaRepository.actualizar(persona);
	}
	@Override
	public PersonaTo buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.iPeronaRepository.buscarPorId(id);
	}
	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.iPeronaRepository.eliminar(id);
	}
	@Override
	public List<PersonaTo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPeronaRepository.buscarTodos();
	}
	
}
