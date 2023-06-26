package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {
	
	@GeneratedValue(generator = "seq_animal", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_animal", sequenceName = "seq_animal", allocationSize = 1)
	@Id
	@Column(name = "anim_id")
	private Integer id;
	
	@Column(name = "anim_tipo")
	private String tipo;
	
	@Column(name = "anim_nombre")
	private String nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", tipo=" + tipo + ", nombre=" + nombre + "]";
	}
	
	
}
