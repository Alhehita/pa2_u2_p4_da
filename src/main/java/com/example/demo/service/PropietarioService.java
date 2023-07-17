package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {
	
	public void guardar(Propietario propietario);

	public Propietario buscar(String apellido);
	
	public void borrar(String apellido);
	
	public void actualizar(Propietario propietario);

}
