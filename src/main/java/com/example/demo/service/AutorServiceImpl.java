package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Autor;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorRepository autorRepository;

	@Override
	public void guardar(Autor autor) {
		this.autorRepository.insertar(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		this.autorRepository.actualizar(autor);
	}

	@Override
	public Autor buscarPorApellido(String apellido) {
		return this.autorRepository.seleccionarPorApellido(apellido);
	}

	@Override
	public void borrar(String apellido) {
		this.autorRepository.eliminar(apellido);
	}

}
