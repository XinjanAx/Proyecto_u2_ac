package com.uce.demo2.cajero.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "cli_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cli_seq_id")
	@SequenceGenerator(name = "cli_seq_id", sequenceName = "cli_seq_id", allocationSize = 1)
	private Integer id;
	
	@Column(name = "cli_ntarjeta")
	private String nTarjeta;
	
	@OneToOne
	@JoinColumn(name = "cli_ciu_id")
	private Ciudadano ciudadano;

	@OneToMany(mappedBy = "cliente")
	private List<Factura> facturas; 
	

//set get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnTarjeta() {
		return nTarjeta;
	}

	public void setnTarjeta(String nTarjeta) {
		this.nTarjeta = nTarjeta;
	}

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}
	public List<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
	
}
