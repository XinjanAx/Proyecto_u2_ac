package com.uce.demo2.tarea22.modelo;

import java.time.LocalDate;

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
@Table(name = "ciudadano_pass22")
public class Ciudadano22 {
	
	@Id
	@Column(name = "ciud_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_seq2_id")
	@SequenceGenerator(name = "ciud_seq2_id", sequenceName = "ciud_seq2_id", allocationSize = 1)
	private Integer id;

	@Column(name = "ciud_nombre")
	private String nombre;

	@Column(name = "ciud_apellido")
	private String apellido;
	
	@Column(name = "ciud_cedula")
	private String cedula;
	
	@Column(name = "ciud_fecha")
	private LocalDate fecha;
	
	@OneToOne(mappedBy = "ciudadano1", cascade=CascadeType.ALL)
	private Pasaporte pasaporte;

	//get set

	@Override
	public String toString() {
		return "\nCiudadano "+ cedula +", "+ nombre + " " + apellido + ", " +  ", fecha: " + fecha
				+ ", pasaporte " + pasaporte;
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



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public Pasaporte getPasaporte() {
		return pasaporte;
	}



	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}
}
