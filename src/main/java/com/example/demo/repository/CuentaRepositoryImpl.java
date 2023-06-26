package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaRepositoryImpl implements CuentaRepository {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void insertar(Cuenta cuenta) {
		
		this.entityManager.persist(cuenta);
		
	}

	@Override
	public void eliminar(String cedula) {
		Cuenta cuenta = this.seleccionarPorNumero(cedula);
		this.entityManager.remove(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.entityManager.merge(cuenta);
	}

	@Override
	public Cuenta seleccionarPorNumero(String cedula) {
		return this.entityManager.find(Cuenta.class, cedula);
	}
	
	
	
	public BigDecimal aumento(BigDecimal saldo, LocalDate fechaAp) {
		
		int dia = fechaAp.getDayOfMonth();
		
		if(dia%2 == 0) {
			saldo = saldo.multiply(new BigDecimal(5).divide(new BigDecimal(100)));
		}
		
		return saldo;
	}
	
	

}
