package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "cuenta")
@Entity
public class Cuenta {
	
	@GeneratedValue(generator = "seq_cuenta", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cuenta", sequenceName = "seq_cuenta", allocationSize = 1)
	@Id
	@Column(name = "cuen_id")
	private Integer id;
	
	@Column(name = "cuen_numero")
	private String numero;
	
	@Column(name = "cuen_tipo")
	private String tipo;
	
	@Column(name = "cuen_saldo")
	private BigDecimal saldo;
	
	@Column(name = "cuen_fechaAp")
	private LocalDate fechaApertura;

	@Column(name = "cuen_cedula")
	private String cedula;
	
	
	//Get and Set
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public LocalDate getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Cuenta [ numero =" + numero + ", tipo =" + tipo + ", saldo=" + saldo + ", fechaApertura="
				+ fechaApertura + ", cedula =" + cedula + "]";
	}
	
	

	
}
