package com.uce.demo2.colegio.modelo;

import java.io.Serializable;

public class EstudianteSencillo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cedula;
	private boolean gratuidad;
	
	public EstudianteSencillo() {}

	public EstudianteSencillo(String cedula, boolean gratuidad) {
		this.cedula = cedula;
		this.gratuidad = gratuidad;
	}

	@Override
	public String toString() {
		return "\nEstudianteSencillo " + cedula + ", " + gratuidad;
	}
	
	
//get set

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
