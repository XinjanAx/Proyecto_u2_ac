package com.uce.demo2.tarea16.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="propietario")
public class Propietario {

	@Id
    @Column(name = "prop_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prop_seq_id")
    @SequenceGenerator(name = "prop_seq_id", sequenceName = "prop_seq_id", allocationSize = 1)
    private Integer id;
	
	@Column(name = "prop_nombre")
    private String nombre;

    @Column(name = "prop_apellido")
    private String apellido;
    
    @Column(name = "prop_cedula")
    private String cedula;
    
	
	@Override
	public String toString() {
		return "Propietario: id " + id + ", " + nombre + " " + apellido;
	}

	//get set
	public String getNombre() {
		return nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
