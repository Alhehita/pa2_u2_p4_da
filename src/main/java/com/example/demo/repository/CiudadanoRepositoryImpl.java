package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepositoryImpl implements CiudadanoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Ciudadano ciudadano) {
		this.entityManager.persist(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.entityManager.merge(ciudadano);
	}

	@Override
	public Ciudadano seleccionarPorCedula(String cedula) {
		return this.entityManager.find(Ciudadano.class, cedula);
	}

	@Override
	public void eliminar(String cedula) {
		Ciudadano ciudadano = this.seleccionarPorCedula(cedula);
		this.entityManager.remove(ciudadano);
	}

}
