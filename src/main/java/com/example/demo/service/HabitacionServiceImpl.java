package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HabitacionRepository;
import com.example.demo.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements HabitacionService {

	@Autowired
	private HabitacionRepository habitacionRepository;

	@Override
	public void guardar(Habitacion habitacion) {
		this.habitacionRepository.insertar(habitacion);

	}

	@Override
	public Habitacion buscar(String numHabitacion) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionar(numHabitacion);
	}

	@Override
	public void borrar(String numHabitacion) {
		this.habitacionRepository.eliminar(numHabitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.habitacionRepository.actualizar(habitacion);
	}

}
