package com.example.demo.repository.modelo.dto;

public class EstudianteDTO {

	private String apellido;

	private String nombre;

	public EstudianteDTO() {

	}

	public EstudianteDTO(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "\nEstudianteDTO [apellido=" + apellido + ", nombre=" + nombre + "]";
	}

}
