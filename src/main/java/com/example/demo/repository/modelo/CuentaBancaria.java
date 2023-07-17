package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta_bancaria")
public class CuentaBancaria {

	@GeneratedValue(generator = "seq_cuenta_bancaria", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cuenta_bancaria", sequenceName = "seq_cuenta_bancaria", allocationSize = 1)
	@Column(name = "ctba_id")
	@Id

	private Integer id;

	@Column(name = "ctba_numero")
	private String numero;

	@Column(name = "ctba_tipo")
	private String tipo;

	@Column(name = "ctba_saldo")
	private BigDecimal saldo;

	@Column(name = "ctba_id_prop")
	private String idPropietario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ctba_id_propietario")
	private Propietario propietario;
	
	@OneToMany(mappedBy = "cuentaBancariaOrigen", fetch = FetchType.LAZY)
	private List<Transferencia> transferenciasO;
	

	@OneToMany(mappedBy = "cuentaBancariaDestino",fetch = FetchType.LAZY)
	private List<Transferencia> transferenciasD;

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

	public String getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	

	public List<Transferencia> getTransferenciasO() {
		return transferenciasO;
	}

	public void setTransferenciasO(List<Transferencia> transferenciasO) {
		this.transferenciasO = transferenciasO;
	}

	public List<Transferencia> getTransferenciasD() {
		return transferenciasD;
	}

	public void setTransferenciasD(List<Transferencia> transferenciasD) {
		this.transferenciasD = transferenciasD;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo
				+ ", idPropietario=" + idPropietario + "]";
	}

	
}
