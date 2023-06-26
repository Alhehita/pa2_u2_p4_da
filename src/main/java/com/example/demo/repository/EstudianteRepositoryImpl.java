package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);
	}

	@Override
	public Estudiante seleccionarPorNumero(String cedula) {
		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estudiante = this.seleccionarPorNumero(cedula);
		this.entityManager.remove(estudiante);
	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// SQL
		// SELECT * FROM estudiante e WHERE e.estu_apellido =
		// JPQL
		// SELECT e FROM Estudiante e WHERE e.apellido =
		Query query = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		query.setParameter("datoApellido", apellido);

		return (Estudiante) query.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		Query query = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		query.setParameter("datoApellido", apellido);

		return query.getResultList();
	}

	@Override
	public Estudiante seleccionarPorApellidoYNombre(String apellido, String nombre) {
		Query query = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
		query.setParameter("datoApellido", apellido);
		query.setParameter("datoNombre", nombre);

		return (Estudiante) query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		TypedQuery<Estudiante> query = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		query.setParameter("datoApellido", apellido);
		return query.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellidoTyped(String apellido) {
		TypedQuery<Estudiante> query = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		query.setParameter("datoApellido", apellido);
		return query.getResultList();
	}

}
