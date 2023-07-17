package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Transferencia;

public interface TransferenciaRepository {

	public void insertar(Transferencia transferencia);

	public Transferencia seleccionar(String numero);
	
	public List<Transferencia> listaTransferencias();

}
