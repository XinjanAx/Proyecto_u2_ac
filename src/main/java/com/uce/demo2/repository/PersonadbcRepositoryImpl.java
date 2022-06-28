package com.uce.demo2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.demo2.to.Persona;

@Repository
public class PersonadbcRepositoryImpl implements IPersonadbcRepository {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public Persona buscarPorId(int id) {
		// TODO Auto-generated method stub

		System.out.println("Se encontro la persona");

		return this.jdbc.queryForObject("select * from persona where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Persona>(Persona.class));

	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.jdbc.update("INSERT INTO persona(id, nombre, apellido) VALUES (?, ?, ?)",
				new Object[] { persona.getId(), persona.getNombre(), persona.getApellido() });
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.jdbc.update("update persona set nombre=?, apellido=? where id=?",
				new Object[] { persona.getNombre(), persona.getApellido(), persona.getId() });
		System.out.println("logro actualizar en la base de datos");
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.jdbc.update("delete from persona where id=?", new Object[] { id });

		System.out.println("Se elimino de la base de datos");
	}

}
