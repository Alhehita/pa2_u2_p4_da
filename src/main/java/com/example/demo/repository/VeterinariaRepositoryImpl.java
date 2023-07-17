package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Animal;
import com.example.demo.repository.modelo.Veterinaria;

import aj.org.objectweb.asm.Type;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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

	@Override
	public List<Veterinaria> seleccionarVetJoin() {
		TypedQuery<Veterinaria> query = this.entityManager.createQuery("SELECT v FROM Veterinaria v JOIN v.animales an",
				Veterinaria.class);
		return query.getResultList();
	}

	@Override
	public List<Animal> seleccionarAnimJoin() {
		TypedQuery<Animal> query = this.entityManager.createQuery("SELECT an FROM Veterinaria v JOIN v.animales an",
				Animal.class);
		return query.getResultList();
	}

	@Override
	public List<Veterinaria> seleccionarVetRightJoin() {
		TypedQuery<Veterinaria> query = this.entityManager
				.createQuery("SELECT v FROM Veterinaria v RIGHT JOIN v.animales an", Veterinaria.class);
		return query.getResultList();
	}

	@Override
	public List<Animal> seleccionarAnimRightJoin() {
		TypedQuery<Animal> query = this.entityManager
				.createQuery("SELECT an FROM Veterinaria v RIGHT JOIN v.animales an", Animal.class);
		return query.getResultList();
	}

	@Override
	public List<Veterinaria> seleccionarVetLeftJoin() {
		TypedQuery<Veterinaria> query = this.entityManager
				.createQuery("SELECT v FROM Veterinaria v LEFT JOIN v.animales an", Veterinaria.class);
		return query.getResultList();
	}

	@Override
	public List<Animal> seleccionarAnimLeftJoin() {
		TypedQuery<Animal> query = this.entityManager
				.createQuery("SELECT an FROM Veterinaria v LEFT JOIN v.animales an", Animal.class);
		return query.getResultList();
	}

	@Override
	public List<Veterinaria> seleccionarVetFullJoin() {
		TypedQuery<Veterinaria> query = this.entityManager
				.createQuery("SELECT v FROM Veterinaria v FULL JOIN v.animales an", Veterinaria.class);
		return query.getResultList();
	}

	@Override
	public List<Animal> seleccionarAnimFullJoin() {
		TypedQuery<Animal> query = this.entityManager
				.createQuery("SELECT an FROM Veterinaria v FULL JOIN v.animales an", Animal.class);
		return query.getResultList();
	}

	@Override
	public List<Veterinaria> seleccionarVetWhereJoin() {
		TypedQuery<Veterinaria> query = this.entityManager
				.createQuery("SELECT v FROM Veterinaria v, Animal an WHERE v = an.veterinaria", Veterinaria.class);
		return query.getResultList();
	}

	@Override
	public List<Animal> seleccionarAnimWhereJoin() {
		TypedQuery<Animal> query = this.entityManager
				.createQuery("SELECT an FROM Veterinaria v,Animal an WHERE v = an.veterinaria", Animal.class);
		return query.getResultList();
	}

	@Override
	public List<Veterinaria> seleccionarVetFetchJoin() {
		TypedQuery<Veterinaria> query = this.entityManager
				.createQuery("SELECT v FROM Veterinaria v JOIN FETCH v.animales an", Veterinaria.class);

		return query.getResultList();
	}

	

}
