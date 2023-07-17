package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.Transferencia;

public interface TransferenciaService {
	

	public void guardar(Transferencia transferencia);

	public Transferencia buscar(String numero);
	
	
	public void realizar(String numCtaOrigen, String numCtaDestino, BigDecimal monto);

}
