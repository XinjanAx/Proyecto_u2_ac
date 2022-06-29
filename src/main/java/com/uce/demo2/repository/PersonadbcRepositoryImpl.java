package com.uce.demo2.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.uce.demo2.to.PersonaTo;

@Repository
public class PersonadbcRepositoryImpl implements IPersonadbcRepository {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public PersonaTo buscarPorId(int id) {
		// TODO Auto-generated method stub

		System.out.println("Se encontro la persona");

		return this.jdbc.queryForObject("select * from persona where id=?", new Object[] { id },
				new BeanPropertyRowMapper<PersonaTo>(PersonaTo.class));

	}

	@Override
	public void insertar(PersonaTo persona) {
		// TODO Auto-generated method stub
		this.jdbc.update("INSERT INTO persona(id, nombre, apellido) VALUES (?, ?, ?)",
				new Object[] { persona.getId(), persona.getNombre(), persona.getApellido() });
	}

	@Override
	public void actualizar(PersonaTo persona) {
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

	@Override
	public List<PersonaTo> buscarTodos() {
		// TODO Auto-generated method stub
		System.out.println("Tabla de la base de datos:\n");
		return this.jdbc.query("select * from persona;",new PersonaRowMapper());
	}
	
	class PersonaRowMapper implements RowMapper <PersonaTo> {

		@Override
		public PersonaTo mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			PersonaTo p = new PersonaTo();
			p.setId(rs.getInt("id"));
			p.setNombre(rs.getString("nombre"));
			p.setApellido(rs.getString("apellido"));
			return p;
		}
		
	}

}
