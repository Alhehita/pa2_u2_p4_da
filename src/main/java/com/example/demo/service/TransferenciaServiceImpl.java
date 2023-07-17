package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CuentaBancariaRepository;
import com.example.demo.repository.TransferenciaRepository;
import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	@Autowired
	private TransferenciaRepository transferenciaRepository;
	
	@Autowired
	private CuentaBancariaRepository cuentaBancariaRepository;

	@Override
	public void guardar(Transferencia transferencia) {
		this.transferenciaRepository.insertar(transferencia);
	}

	@Override
	public Transferencia buscar(String numero) {
		return this.transferenciaRepository.seleccionar(numero);
	}

		@Override
	public void realizar(String numCtaOrigen, String numCtaDestino, BigDecimal monto) {

			CuentaBancaria ctaOrigen = this.cuentaBancariaRepository.seleccionar(numCtaOrigen);
			
			BigDecimal saldoOrigen = ctaOrigen.getSaldo();
			
			if (monto.compareTo(saldoOrigen) <= 0) {
				
				BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
				
				ctaOrigen.setSaldo(nuevoSaldoOrigen);
				
				this.cuentaBancariaRepository.actualizar(ctaOrigen);
				
				CuentaBancaria ctaDestino = this.cuentaBancariaRepository.seleccionar(numCtaDestino);
				
				BigDecimal saldoDestino = ctaDestino.getSaldo();
				
				BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
				
				ctaDestino.setSaldo(nuevoSaldoDestino);
				
				this.cuentaBancariaRepository.actualizar(ctaDestino);
				
				Transferencia transfer = new Transferencia();
				
				transfer.setCuentaBancariaOrigen(ctaOrigen);
				
				transfer.setCuentaBancariaDestino(ctaDestino);
				
				transfer.setMonto(monto);
										
				transfer.setFecha(LocalDateTime.now());
				
				this.transferenciaRepository.insertar(transfer);
		
				
			} else {
				System.out.println("No hay saldo suficiente para realizar la transferencia. \nSu saldo es: " + saldoOrigen);
			}


	}

}
