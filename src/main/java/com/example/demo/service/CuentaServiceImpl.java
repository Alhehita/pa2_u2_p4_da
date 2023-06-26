package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.CuentaRepository;
import com.example.demo.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService {

	CuentaRepository cuentaRepository;

	@Override
	public void guardar(Cuenta cuenta) {
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public void borrar(String cedula) {
		this.cuentaRepository.eliminar(cedula);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public Cuenta buscarPorNumero(String cedula) {
		return this.cuentaRepository.seleccionarPorNumero(cedula);
	}

}
