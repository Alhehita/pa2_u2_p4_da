package com.example.demo.repository;

import com.example.demo.repository.modelo.Hotel;

public interface HotelRepository {

	public void insertar(Hotel hotel);

	public Hotel seleccionar(Integer id);

	public void eliminar(Integer id);

	public void actualizar(Hotel hotel);

	public Hotel seleccionarPorIdNombre(Integer id);

}
