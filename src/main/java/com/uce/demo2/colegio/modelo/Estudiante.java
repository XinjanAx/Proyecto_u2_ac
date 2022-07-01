package com.uce.demo2.colegio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "nombre")
    private String nombre;
	
	
	@Column(name = "apellido")
    private String apellido;
	
	@Column(name = "fecha")
    private String fecha;	
	
	@Override
	public String toString() {
		return "\nEstudiante id:" + id + ", " + edad + ", " + nombre + " " + apellido
				+ ", Fecha: " + fecha;
	}

	//get set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
