package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "transferencia")
public class Transferencia {

	@GeneratedValue(generator = "seq_transferencia", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_transferencia", sequenceName = "seq_transferencia", allocationSize = 1)
	@Column(name = "tnfe_id")
	@Id
	private Integer id;


	@Column(name = "tnfe_monto")
	private BigDecimal monto;

	@Column(name = "tnfe_fecha")
	private LocalDateTime fecha;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="cuenta_id_origen")
	private CuentaBancaria cuentaBancariaOrigen;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="cuenta_id_destino")
	private CuentaBancaria cuentaBancariaDestino;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	
	public CuentaBancaria getCuentaBancariaOrigen() {
		return cuentaBancariaOrigen;
	}

	public void setCuentaBancariaOrigen(CuentaBancaria cuentaBancariaOrigen) {
		this.cuentaBancariaOrigen = cuentaBancariaOrigen;
	}

	public CuentaBancaria getCuentaBancariaDestino() {
		return cuentaBancariaDestino;
	}

	public void setCuentaBancariaDestino(CuentaBancaria cuentaBancariaDestino) {
		this.cuentaBancariaDestino = cuentaBancariaDestino;
	}

	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", monto=" + monto + ", fecha=" + fecha + "]";
	}
	
	
	
}
