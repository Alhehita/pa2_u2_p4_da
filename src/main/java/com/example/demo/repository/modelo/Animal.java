package com.example.demo.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

	@Column(name = "anim_raza")
	private String raza;

	@Column(name = "anim_peso")
	private Double peso;

	@Column(name = "anim_edad")
	private LocalDate fechaNacimiento;

	@ManyToOne
	@JoinColumn(name = "anim_id_veteriaria")
	private Veterinaria veterinaria;

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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate edad) {
		this.fechaNacimiento = edad;
	}

	public Veterinaria getVeterinaria() {
		return veterinaria;
	}

	public void setVeterinaria(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", tipo=" + tipo + ", nombre=" + nombre + ", raza=" + raza + ", peso=" + peso
				+ ", FechaNacimiento=" + fechaNacimiento + "]";
	}

}
