package com.uce.demo2.cajero.repository;

import com.uce.demo2.cajero.modelo.Factura;

public interface IFacturaRepository {

	public void incertar(Factura factura);
	public Factura consultarPorId(Integer id);
}
