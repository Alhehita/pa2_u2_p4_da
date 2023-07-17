package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService {

	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public void guardar(Propietario propietario) {
		this.propietarioRepository.insertar(propietario);

	}

	@Override
	public Propietario buscar(String apellido) {
		return this.propietarioRepository.seleccionar(apellido);
	}

	@Override
	public void borrar(String apellido) {
		this.propietarioRepository.eliminar(apellido);
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.propietarioRepository.actualizar(propietario);
	}

}
