package com.uce.demo2.tarea23.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pais")
public class Pais {
	@Id
	@Column(name = "pais_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pais_seq_id")
	@SequenceGenerator(name = "pais_seq_id", sequenceName = "pais_seq_id", allocationSize = 1)
	private Integer id;
	
	@Column(name = "pais_nombre")
	private String nombre;
	
	@Column(name = "pais_idioma")
	private String idioma;
	
	@Column(name = "pais_tipo")
	private String tipo;
	
	@Column(name = "pais_territorio")
	private String territorio;
	
	@OneToMany(mappedBy="pais")
	private List<Ciudad> ciudades;

	@Override
	public String toString() {
		return "\nPais " + nombre + ", idioma: " + idioma + ", pais " + tipo + ", territorio: " + territorio
				+ "km2, \nCiudades:[" + ciudades + "\n]";
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

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTerritorio() {
		return territorio;
	}

	public void setTerritorio(String territorio) {
		this.territorio = territorio;
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	

}
