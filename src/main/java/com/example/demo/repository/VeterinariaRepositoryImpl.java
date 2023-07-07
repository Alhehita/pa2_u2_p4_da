package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Veterinaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VeterinariaRepositoryImpl implements VeterinariaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Veterinaria veterinaria) {
		this.entityManager.persist(veterinaria);
	}

	@Override
	public void actualizar(String nombre) {
		this.entityManager.merge(nombre);
	}

}
