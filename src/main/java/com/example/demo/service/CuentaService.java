package com.example.demo.service;

import com.example.demo.repository.modelo.Cuenta;
import com.example.demo.repository.modelo.Estudiante;

public interface CuentaService {

	
	public void guardar(Cuenta cuenta );
	
	public void borrar(String cedula);
	
	public void actualizar(Cuenta cuenta );
	
	public Cuenta buscarPorNumero(String cedula);

}
