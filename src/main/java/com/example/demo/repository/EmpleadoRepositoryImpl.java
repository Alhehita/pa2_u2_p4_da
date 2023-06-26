package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepositoryImpl implements EmpleadoRepository {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.entityManager.merge(empleado);
	}

	@Override
	public Empleado seleccionarPorCargo(String cargo) {
		return this.entityManager.find(Empleado.class, cargo);
	}

	@Override
	public void eliminar(String cargo) {
		Empleado empleado = this.seleccionarPorCargo(cargo);
		this.entityManager.remove(empleado);
	}

}
