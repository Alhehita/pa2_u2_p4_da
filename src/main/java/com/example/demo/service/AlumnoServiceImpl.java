package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AlumnoRepository;
import com.example.demo.repository.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public void guardar(Alumno alumno) {
		this.alumnoRepository.insertar(alumno);
	}

}
