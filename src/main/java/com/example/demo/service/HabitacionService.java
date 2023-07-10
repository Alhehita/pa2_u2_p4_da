package com.example.demo.service;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionService {

	public void guardar(Habitacion habitacion);

	public Habitacion buscar(String numHabitacion);

	public void borrar(String numHabitacion);

	public void actualizar(Habitacion habitacion);

}
