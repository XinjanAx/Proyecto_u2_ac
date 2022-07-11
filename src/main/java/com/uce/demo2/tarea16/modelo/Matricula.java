package com.uce.demo2.tarea16.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Entity
//@Table(name="matricula")
public class Matricula {
	
	//@Id
    //@Column(name = "mat_id")
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mat_seq_id")
    //@SequenceGenerator(name = "mat_seq_id", sequenceName = "mat_seq_id", allocationSize = 1)
    private Integer id;
	
	// @Column(name = "mat_fecha")
	 private LocalDateTime fechaMatricula;

	// @Column(name = "mat_valor")
	 private BigDecimal valorMAtricula;
	    
	 //@Column(name = "mat_protietatio")
	 private Propietario propietario;
	    
	 //@Column(name = "mat_vehiculo")
	 private Vehiculo vehiculo;
	    
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMAtricula() {
		return valorMAtricula;
	}
	public void setValorMAtricula(BigDecimal valorMAtricula) {
		this.valorMAtricula = valorMAtricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPopietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "\nMatricula \nfecha:" + fechaMatricula + ", valor Matricula $" + valorMAtricula + "\n	  "
				+ propietario + "\n	  " + vehiculo;
	}
	

}
