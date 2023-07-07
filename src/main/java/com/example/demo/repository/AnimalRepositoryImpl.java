package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Animal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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

	@Override
	public List<Animal> seleccionarAnimalDinamico(String nombre, String tipo, LocalDate fecha) {

		CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Animal> criteriaQuery = builder.createQuery(Animal.class);

		Root<Animal> miTablaFrom = criteriaQuery.from(Animal.class);

		Predicate pNombre = builder.equal(miTablaFrom.get("nombre"), nombre);

		Predicate pTipo = builder.equal(miTablaFrom.get("tipo"), tipo);

		Predicate predicadoFinal = null;
		LocalDate fechaComparacion = LocalDate.of(2015, 01, 01);
		if (fecha.compareTo(fechaComparacion) > 0) {
			predicadoFinal = builder.or(pNombre, pTipo);
		} else {
			predicadoFinal = builder.and(pNombre, pTipo);
		}

		criteriaQuery.select(miTablaFrom).where(predicadoFinal);

		TypedQuery<Animal> queryFinal = this.entityManager.createQuery(criteriaQuery);

		return queryFinal.getResultList();
	}

	@Override
	public int eliminarAnimalPorN(String nombre) {
		Query query = this.entityManager.createQuery("DELETE FROM Animal a WHERE a.nombre = :datoNombre");
		query.setParameter("datoNombre", nombre);
		
		return query.executeUpdate();
	}

	@Override
	public int actualizarPorPeso(Double peso, String nombre) {
		Query query = this.entityManager.createQuery("UPDATE Animal a SET a.nombre= :datoNombre WHERE a.peso= :datoPeso");
		query.setParameter("datoNombre", nombre);
		query.setParameter("datoPeso", peso);
		
		return query.executeUpdate();
	}

}
