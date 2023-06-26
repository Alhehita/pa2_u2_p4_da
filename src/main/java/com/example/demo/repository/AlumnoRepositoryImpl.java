package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AlumnoRepositoryImpl implements AlumnoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Alumno alumno) {
		this.entityManager.persist(alumno);
	}

}
