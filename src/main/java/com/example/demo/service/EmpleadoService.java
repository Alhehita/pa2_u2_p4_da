package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {
	
public void guardar(Empleado empleado);
	
	public void actualizar(Empleado empleado);
	
	public Empleado buscarPorCedula(String cargo);
	
	public void borrar(String cargo);

}
