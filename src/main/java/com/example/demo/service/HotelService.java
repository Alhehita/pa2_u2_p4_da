package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {

	public void guardar(Hotel hotel);

	public Hotel buscar(Integer id);

	public void borrar(Integer id);

	public void actualizar(Hotel hotel);
	
	public Hotel buscarPorIdNombre(Integer id);

}
