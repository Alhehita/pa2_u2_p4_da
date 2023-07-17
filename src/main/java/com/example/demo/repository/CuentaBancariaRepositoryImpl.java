package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CuentaBancariaRepositoryImpl implements CuentaBancariaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public void eliminar(String cedula) {
		CuentaBancaria cuentaBancaria = this.seleccionar(cedula);
		this.entityManager.remove(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public CuentaBancaria seleccionar(String cuenta) {
		TypedQuery<CuentaBancaria> myQuery = this.entityManager.createQuery("SELECT c FROM CuentaBancaria c JOIN FETCH c.propietario WHERE c.numero = :numero",CuentaBancaria.class); //JOIN e INNER JOIN son lo mismo, solo es abreviacion
		myQuery.setParameter("numero", cuenta);
		return myQuery.getSingleResult();	}

}
