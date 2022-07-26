package com.uce.demo2.tarea24.modelo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "autorT24")
public class AutorT {
	
	@Id
	@Column(name = "aut_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aut_seq_id")
	@SequenceGenerator(name = "aut_seq_id", sequenceName = "aut_seq_id", allocationSize = 1)
	private Integer id;

	@Column(name = "aut_nombre")
	private String nombre;
	
	@OneToMany(mappedBy= "autores",cascade = CascadeType.ALL)
	private Set<AutorLibro> autoresLibrosA;
	
	@Override
	public String toString() {
		return "Autor " + nombre;
	}
	
	//get set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<AutorLibro> getAutoresLibrosA() {
		return autoresLibrosA;
	}

	public void setAutoresLibrosA(Set<AutorLibro> autoresLibrosA) {
		this.autoresLibrosA = autoresLibrosA;
	}


}
