package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CuentaBancariaRepository;
import com.example.demo.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService {

	@Autowired
	private CuentaBancariaRepository cuentaBancariaRepository;

	@Override
	public void crear(CuentaBancaria cuentaBancaria) {
		this.cuentaBancariaRepository.insertar(cuentaBancaria);
	}

	@Override
	public void borrar(String numero) {
		this.cuentaBancariaRepository.eliminar(numero);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		this.cuentaBancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		return this.cuentaBancariaRepository.seleccionar(numero);
	}

}
