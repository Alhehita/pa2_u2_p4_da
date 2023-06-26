package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoRepository {
	
	public void insertar(Empleado empleado);
	
	public void actualizar(Empleado empleado);
	
	public Empleado seleccionarPorCargo(String cargo);
	
	public void eliminar(String cargo);

}
