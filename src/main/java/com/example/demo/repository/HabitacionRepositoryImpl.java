package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HabitacionRepositoryImpl implements HabitacionRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
	}

	@Override
	public Habitacion seleccionar(String numHabitacion) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, numHabitacion);
	}

	@Override
	public void eliminar(String numHabitacion) {
		// TODO Auto-generated method stub
		Habitacion habitacion = this.seleccionar(numHabitacion);
		this.entityManager.refresh(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.entityManager.merge(habitacion);
	}

}
