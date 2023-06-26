package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CiudadanoRepository;
import com.example.demo.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements CiudadanoService {

	@Autowired
	CiudadanoRepository ciudadanoRepository;

	@Override
	public void guardar(Ciudadano ciudadano) {
		this.ciudadanoRepository.insertar(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.actualizar(ciudadano);
	}

	@Override
	public Ciudadano buscarPorCedula(String cedula) {
		return this.buscarPorCedula(cedula);
	}

	@Override
	public void borrar(String cedula) {
		this.borrar(cedula);
	}

}
