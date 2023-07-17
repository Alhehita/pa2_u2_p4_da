package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Propietario propietario) {
		this.entityManager.persist(propietario);
	}

	@Override
	public Propietario seleccionar(String apellido) {
		return this.entityManager.find(Propietario.class, apellido);
	}

	@Override
	public void eliminar(String apellido) {
		Propietario propietario = this.seleccionar(apellido);
		this.entityManager.remove(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
this.entityManager.merge(propietario);
	}

}
