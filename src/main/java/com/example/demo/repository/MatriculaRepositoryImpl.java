package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements MatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		this.entityManager.persist(matricula);
	}

	/*
	 * @Override public List<MatriculaDTO> seleccionarTodos() {
	 * TypedQuery<MatriculaDTO> query = this.entityManager.createQuery(
	 * "SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(a.nombre, m.nombre) FROM Alumno a, Materia m"
	 * , MatriculaDTO.class); return query.getResultList(); }
	 */

	@Override
	public List<MatriculaDTO> seleccionarTodos() {
		TypedQuery<MatriculaDTO> query = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(m.materia.nombre, m.alumno.nombre) FROM Matricula m",
				MatriculaDTO.class);
		return query.getResultList();
	}

	@Override
	public List<MatriculaDTO> seleccionarTodosPorFecha() {
		TypedQuery<MatriculaDTO> query = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(m.materia.nombre, m.alumno.nombre, m.fecha) FROM Matricula m",
				MatriculaDTO.class);
		return query.getResultList();
	}

}
