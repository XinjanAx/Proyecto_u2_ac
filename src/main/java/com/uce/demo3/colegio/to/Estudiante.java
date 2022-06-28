package com.uce.demo3.colegio.to;


public class Estudiante {
	private int id, edad;
    private String nombre;
    private String apellido;
    private String ingreso;
    
	@Override
	public String toString() {
		return "Estudiante id:" + id + ", " + edad + ", " + nombre + " " + apellido
				+ ", ingreso: " + ingreso;
	}
	
	public Estudiante() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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

	public String getIngreso() {
		return ingreso;
	}

	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}

	public Estudiante(int id, int edad, String nombre, String apellido, String ingreso) {
		super();
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ingreso = ingreso;
	}   
}
