package com.uce.demo2.colegio.modelo;

import java.io.Serializable;

public class EstudianteGroupGratuidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean gratuidad;
	private long contador;
	
	public EstudianteGroupGratuidad() {}

	public EstudianteGroupGratuidad(boolean gratuidad, long contador) {
		super();
		this.gratuidad = gratuidad;
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "\nEstudianteGroupGratuidad " + gratuidad + "	;	" + contador;
	}
	
//get set
	public boolean isGratuidad() {
		return gratuidad;
	}

	public void setGratuidad(boolean gratuidad) {
		this.gratuidad = gratuidad;
	}

	public long getContador() {
		return contador;
	}

	public void setContador(long contador) {
		this.contador = contador;
	}
}
