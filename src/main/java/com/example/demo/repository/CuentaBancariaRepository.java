package com.example.demo.repository;

import com.example.demo.repository.modelo.CuentaBancaria;

public interface CuentaBancariaRepository {

	public void insertar(CuentaBancaria cuentaBancaria);

	public void eliminar(String numero);

	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria seleccionar(String cuenta);

}
