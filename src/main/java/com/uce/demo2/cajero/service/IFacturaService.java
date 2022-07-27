package com.uce.demo2.cajero.service;

import com.uce.demo2.cajero.modelo.Factura;

public interface IFacturaService {

	public void incertar(Factura factura);
	public Factura consultarPorId(Integer id);
}
