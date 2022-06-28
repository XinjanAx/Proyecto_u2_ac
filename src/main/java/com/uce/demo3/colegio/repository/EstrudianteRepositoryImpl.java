package com.uce.demo3.colegio.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.demo3.colegio.to.Estudiante;

@Repository
public class EstrudianteRepositoryImpl implements IEstudianteRepository{
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la base de datos...");
		this.jdbc.update("INSERT INTO estudiante(id, nombre, apellido, edad, fecha) VALUES (?, ?, ?, ?, ?)",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),estudiante.getEdad(), estudiante.getIngreso() });
	
	}

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la base de datos...");
		
		return this.jdbc.queryForObject("select * from estudiante where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la base de datos...");
		this.jdbc.update("UPDATE public.estudiante set nombre=?, apellido=?, edad=?, fecha=? WHERE id=?;",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),estudiante.getEdad(), estudiante.getIngreso() });
	
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		System.out.println("Conectando a la base de datos...");
		this.jdbc.update("delete from estudiante where id=?", new Object[] { id });
	}
	


}
