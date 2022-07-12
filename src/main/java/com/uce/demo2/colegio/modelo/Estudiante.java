package com.uce.demo2.colegio.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")

@NamedQuery(name = "Estudiante.buscarPorCedula", 
			query = "SELECT e FROM Estudiante e WHERE e.cedula = :datoCedula")

@NamedQuery(name = "Estudiante.edadesDecendentes", 
			query = "SELECT e FROM Estudiante e ORDER BY e.edad desc")

@NamedQuery(name = "Estudiante.gratuidadPorEdadesMenoresA",
			query ="SELECT e FROM Estudiante e WHERE e.gratuidad = true AND e.edad < :datoEdad")

public class Estudiante {
	
	@Id
	@Column(name = "est_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "est_seq_id")
	@SequenceGenerator(name = "est_seq_id", sequenceName = "est_seq_id", allocationSize = 1)
	private Integer id;
	
	@Column(name = "est_edad")
	private Integer edad;
	
	@Column(name = "est_nombre")
    private String nombre;
	
	@Column(name = "est_cedula")
    private String cedula;
	
	@Column(name = "est_apellido")
    private String apellido;
	
	@Column(name = "est_fecha")
    private LocalDateTime fecha;	
	
	@Column(name = "est_gratuidad")
    private boolean gratuidad;
	
	@Override
	public String toString() {
		return "\nEstudiante  CI:" + cedula + ", " + edad + " años, " + nombre + " " + apellido
				+ ", gratuidad: "+gratuidad +", Fecha de ingreso: " + fecha;
	}

//	get set

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

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public boolean isGratuidad() {
		return gratuidad;
	}

	public void setGratuidad(boolean gratuidad) {
		this.gratuidad = gratuidad;
	}
}
