package com.uce.demo2.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {
	
	@Id
	@Column(name = "ciud_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_seq_id")
	@SequenceGenerator(name = "ciud_seq_id", sequenceName = "ciud_seq_id", allocationSize = 1)
	private Integer id;

	@Column(name = "ciud_nombre")
	private String nombre;

	@Column(name = "ciud_apellido")
	private String apellido;
	
	@OneToOne(mappedBy = "ciudadano1", cascade=CascadeType.ALL)//mismo nombre con el mapeo en la otra tabla
	private Empleado empleado1;

	@Override
	public String toString() {
		return "\nCiudadano " + id + ", " + nombre + " " + apellido;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
