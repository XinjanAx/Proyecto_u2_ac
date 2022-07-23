package com.uce.demo2.service.onetomany;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.modelo.onetomany.Hotel;
import com.uce.demo2.repository.onetomany.IHotelJpaRepository;

@Service
public class HotelJpaServiceImpl implements IHotelJpaService{

	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	
	@Autowired
	private IHotelJpaRepository hotelJpaRepository;
	@Override
	public void insertar(Hotel hotel) {
		Log.info("\nConectando a la base de datos...");
		this.hotelJpaRepository.insertar(hotel);
	}

}
