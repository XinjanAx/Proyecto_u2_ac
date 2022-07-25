package com.uce.demo2.tarea22.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.demo2.modelo.onetoone.Ciudadano;


@Entity
@Table(name = "pasaporte")
public class Pasaporte {
	
	@Id
	@Column(name = "pass_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pass_seq_id")
	@SequenceGenerator(name = "pass_seq_id", sequenceName = "pass_seq_id", allocationSize = 1)
	private Integer id;

	@Column(name = "pass_numero")
	private String numero;
	
	@Column(name = "pass_fEmision")
	private LocalDate fEmision;

	@Column(name = "pass_fCaducidad")
	private LocalDate fCaducidad;
	
	@OneToOne //no hace falta el atributo la anotacion 
	@JoinColumn(name = "pass__id_ciudadano_fk")
	private Ciudadano22 ciudadano1;

	@Override
	public String toString() {
		return  numero + ", Emision " + fEmision + ", Caducidad " + fCaducidad;
	}
	
//get set	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getfEmision() {
		return fEmision;
	}

	public void setfEmision(LocalDate fEmision) {
		this.fEmision = fEmision;
	}

	public LocalDate getfCaducidad() {
		return fCaducidad;
	}

	public void setfCaducidad(LocalDate fCaducidad) {
		this.fCaducidad = fCaducidad;
	}

	public Ciudadano22 getCiudadano1() {
		return ciudadano1;
	}

	public void setCiudadano1(Ciudadano22 ciudadano1) {
		this.ciudadano1 = ciudadano1;
	}



	
	

}
