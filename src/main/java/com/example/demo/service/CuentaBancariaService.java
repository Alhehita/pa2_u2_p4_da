package com.example.demo.service;

import com.example.demo.repository.modelo.CuentaBancaria;

public interface CuentaBancariaService {
	
	public void crear(CuentaBancaria cuentaBancaria);

	public void borrar(String numero);

	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(String numero);

}
