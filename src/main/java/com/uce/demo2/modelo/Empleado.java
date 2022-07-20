package com.uce.demo2.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@Column(name = "empl_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empl_seq_id")
	@SequenceGenerator(name = "empl_seq_id", sequenceName = "empl_seq_id", allocationSize = 1)
	private Integer id;

	@Column(name = "empl_codigo_iess")
	private String codigoIess;

	@Column(name = "empl_salario")
	private BigDecimal salario;
	
	@OneToOne //no hace falta el atributo la anotacion 
	@JoinColumn(name = "empl__id_ciudadano_fk")
	private Ciudadano ciudadano1;

	@Override
	public String toString() {
		return "\nEmpleado " + id + ", " + codigoIess + ", salario:" + salario;
	}	
//get set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoIess() {
		return codigoIess;
	}

	public void setCodigoIess(String codigoIes) {
		this.codigoIess = codigoIes;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Ciudadano getCiudadano1() {
		return ciudadano1;
	}

	public void setCiudadano1(Ciudadano ciudadano1) {
		this.ciudadano1 = ciudadano1;
	}
	
	
}
