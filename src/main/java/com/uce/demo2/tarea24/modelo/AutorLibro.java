package com.uce.demo2.tarea24.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "autorLibro24")
public class AutorLibro {
	
	@Id
	@Column(name = "rel_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rel_seq_id")
	@SequenceGenerator(name = "rel_seq_id", sequenceName = "rel_seq_id", allocationSize = 1)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="auli_id_autor")
	private AutorT autores;
	
	@ManyToOne
	@JoinColumn(name="auli_id_libro")
	private LibroT libros;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AutorT getAutores() {
		return autores;
	}

	public void setAutores(AutorT autores) {
		this.autores = autores;
	}

	public LibroT getLibros() {
		return libros;
	}

	public void setLibros(LibroT libros) {
		this.libros = libros;
	}
}
