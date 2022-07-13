package com.uce.demo2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
//para el NamedQuery
@NamedQuery(name = "Persona.buscarPorCedula", 
			query = "SELECT p FROM Persona p WHERE p.cedula = :datoCedula")
//se puede crear varios NamedQuery
@NamedQuery(name = "Persona.buscarPorNombreApellido", 
			query = "SELECT p FROM Persona p WHERE p.nombre = :datoNombre AND p.apellido = :datoApellido")
//@NamedQueries({@NamedQuery(),@NamedQuery(),...,})  version antigua

@NamedNativeQuery(name = "Persona.buscarPorCedulaNativa",
				  query ="SELECT * FROM persona  WHERE pers_cedula = :datoCedula",
				  resultClass = Persona.class)//con native toca mandar .class por tema de compatibilidad 

//@NamedNativeQueries({@NamedNativeQuery(),@NamedNativeQuery(),...,})  version antigua

public class Persona {

	@Id
	@Column(name = "pers_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_seq_id")
	@SequenceGenerator(name = "pers_seq_id", sequenceName = "pers_seq_id", allocationSize = 1)
	private Integer id;

	@Column(name = "pers_nombre")
	private String nombre;

	@Column(name = "pers_apellido")
	private String apellido;

	@Column(name = "pers_cedula")
	private String cedula;

	@Column(name = "pers_genero")
	private String genero;

	// set get
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "\nPersona " + id + ", nombre: " + nombre + " " + apellido + ", ci: " + cedula + ", g:" + genero;
	}

}
