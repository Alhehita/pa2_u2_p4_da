package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;

	@Override
	public void guardar(Matricula matricula) {
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public List<MatriculaDTO> buscarTodos() {
		return this.matriculaRepository.seleccionarTodos();
	}

	@Override
	public List<MatriculaDTO> buscarTodosPorFecha() {
		return this.matriculaRepository.seleccionarTodosPorFecha();
	}

}
