package com.uce.demo2.cajero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.cajero.modelo.Factura;
import com.uce.demo2.cajero.repository.IFacturaRepository;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepository facturaRepository;
	
	@Override
	public void incertar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepository.incertar(factura);
	}

	@Override
	public Factura consultarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaRepository.consultarPorId(id);
	}

}
