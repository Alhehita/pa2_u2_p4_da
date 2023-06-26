package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Animal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AnimalRepositoryImpl implements AnimalRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Animal animal) {
		this.entityManager.persist(animal);
	}

	@Override
	public void actualizar(String nombre) {
		this.entityManager.merge(nombre);
	}

	@Override
	public Animal seleccionarPorNombre(String nombre) {
		Query query = this.entityManager.createQuery("SELECT a FROM Animal a WHERE a.nombre = :datoNombre");
		query.setParameter("datoNombre", nombre);
		return (Animal) query.getSingleResult();
	}

	@Override
	public List<Animal> seleccionarListaPorTipo(String tipo) {
		Query query = this.entityManager.createQuery("SELECT a FROM Animal a WHERE a.tipo = :datoTipo");
		query.setParameter("datoTipo", tipo);
		return query.getResultList();
	}

	@Override
	public Animal seleccionarPorNombreTyped(String nombre) {
		TypedQuery<Animal> query = this.entityManager.createQuery("SELECT a FROM Animal a WHERE a.nombre = :datoNombre",
				Animal.class);
		query.setParameter("datoNombre", nombre);
		return query.getSingleResult();
	}

	@Override
	public List<Animal> seleccionarListaPorTipoTyped(String tipo) {
		TypedQuery<Animal> query = this.entityManager.createQuery("SELECT a FROM Animal a WHERE a.tipo = :datoTipo",
				Animal.class);
		query.setParameter("datoTipo", tipo);
		return query.getResultList();
	}

}
