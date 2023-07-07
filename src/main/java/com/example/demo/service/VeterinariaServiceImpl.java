package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VeterinariaRepository;
import com.example.demo.repository.modelo.Veterinaria;

import jakarta.persistence.SequenceGenerator;

@Service
public class VeterinariaServiceImpl implements VeterinariaService {

	@Autowired
	private VeterinariaRepository veterinariaRepository;

	@Override
	public void guardar(Veterinaria veterinaria) {
		this.veterinariaRepository.insertar(veterinaria);
	}

	@Override
	public void actualizar(String nombre) {
		this.veterinariaRepository.actualizar(nombre);
	}

}
