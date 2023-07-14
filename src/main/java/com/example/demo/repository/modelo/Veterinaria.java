package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "veterinaria")
public class Veterinaria {
	
	@GeneratedValue(generator = "seq_veterinaria", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_veterinaria", sequenceName = "seq_veterinaria", allocationSize = 1)
	@Id
	@Column(name = "vete_id")
	private Integer id;
	
	@Column(name = "vete_nombre")
	private String nombre;
	
	@Column(name = "vete_direccion")
	private String direccion;
	
	@Column(name = "vete_tlfno")
	private String tlfno;
	
	@Column(name = "vete_tipo_consulta")
	private String tipoConsulta;
	
	@Column(name = "vete_precio_consulta")
	private BigDecimal precioConsulta;
	
	@OneToMany(mappedBy = "veterinaria", cascade = CascadeType.ALL)
	private List<Animal> animales;
	
	
	public List<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTlfno() {
		return tlfno;
	}

	public void setTlfno(String tlfno) {
		this.tlfno = tlfno;
	}

	public String getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public BigDecimal getPrecioConsulta() {
		return precioConsulta;
	}

	public void setPrecioConsulta(BigDecimal precioConsulta) {
		this.precioConsulta = precioConsulta;
	}

	@Override
	public String toString() {
		return "Veterinaria [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", tlfno=" + tlfno
				+ ", tipoConsulta=" + tipoConsulta + ", precioConsulta=" + precioConsulta + "]";
	}
	
	
	

}
