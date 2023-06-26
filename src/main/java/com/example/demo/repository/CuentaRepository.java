package com.example.demo.repository;

import com.example.demo.repository.modelo.Cuenta;

public interface CuentaRepository {

public void insertar(Cuenta cuenta );
	
	public void eliminar(String cedula);
	
	public void actualizar(Cuenta cuenta );
	
	public Cuenta seleccionarPorNumero(String cedula);
}
