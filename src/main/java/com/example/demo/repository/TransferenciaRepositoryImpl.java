package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Transferencia transferencia) {
		this.entityManager.persist(transferencia);
	}

	@Override
	public Transferencia seleccionar(String numero) {
		return this.entityManager.find(Transferencia.class, numero);
	}

	@Override
	public List<Transferencia> listaTransferencias() {
		TypedQuery<Transferencia> myQuery = this.entityManager.createQuery("SELECT t FROM Transferencia t",Transferencia.class);
		List<Transferencia> listaTransferencia = myQuery.getResultList();
		for(Transferencia t: listaTransferencia) {
			t.getCuentaBancariaOrigen();
		}
		return listaTransferencia;
	}
}
