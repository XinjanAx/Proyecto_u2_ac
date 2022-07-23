package com.uce.demo2.service.onetomany;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.modelo.onetomany.Habitacion;
import com.uce.demo2.repository.onetomany.IHabitacionRepository;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	private IHabitacionRepository habitacionRepository;
	
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	
	@Override
	public void insertar(Habitacion habictacion) {
		Log.info("\nConectando a la base de datos...");
		this.habitacionRepository.insertar(habictacion);
	}

}
