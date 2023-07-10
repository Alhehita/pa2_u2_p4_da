package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface HabitacionRepository {

	public void insertar(Habitacion habitacion);

	public Habitacion seleccionar(String numHabitacion);

	public void eliminar(String numHabitacion);

	public void actualizar(Habitacion habitacion);
	


}
