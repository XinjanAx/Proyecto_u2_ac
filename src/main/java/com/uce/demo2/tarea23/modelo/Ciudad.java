package com.uce.demo2.tarea23.modelo;

import java.util.List;

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
@Table(name="ciudad")
public class Ciudad {
	
	@Id
	@Column(name = "ciu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciu_seq_id")
	@SequenceGenerator(name = "ciu_seq_id", sequenceName = "ciu_seq_id", allocationSize = 1)
	private Integer id;
	
	@Column(name = "ciu_nombre")
	private String nombre;
	
	@Column(name = "ciu_superficie")
	private String superficie;
	
	@Column(name = "ciu_poblacion")
	private String poblacion;

	@ManyToOne
	@JoinColumn(name = "ciu_id_pais_fk")
	private Pais pais;

	@Override
	public String toString() {
		return "\n	Ciudad " + nombre + ", superficie: " + superficie + "m2, poblacion: " + poblacion +" hab.";
	}
	
	//set get

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

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}	
}
