package com.uce.demo2.modelo;

import java.io.Serializable;

public class PersonaContadorGenero implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String genero;
	private long contador;
	
	
	
	@Override
	public String toString() {
		return "\n" + genero + "	" + contador;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public long getContador() {
		return contador;
	}
	public void setContador(long contador) {
		this.contador = contador;
	}
	
	
	public PersonaContadorGenero() {
	}
	public PersonaContadorGenero(String genero, long contador) {
		super();
		this.genero = genero;
		this.contador = contador;
	}
	
	

}
