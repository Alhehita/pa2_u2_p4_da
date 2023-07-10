package com.example.demo.repository.modelo.dto;

import java.time.LocalDateTime;

public class MatriculaDTO {

	private String nombreEstudiante;
	private String nombreMateria;
	private LocalDateTime fechaMatricula;

	public MatriculaDTO() {

	}

	public MatriculaDTO(String nombreEstudiante, String nombreMateria) {
		super();
		this.nombreEstudiante = nombreEstudiante;
		this.nombreMateria = nombreMateria;
	}
	
	

	public MatriculaDTO(String nombreEstudiante, String nombreMateria, LocalDateTime fechaMatricula) {
		super();
		this.nombreEstudiante = nombreEstudiante;
		this.nombreMateria = nombreMateria;
		this.fechaMatricula = fechaMatricula;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	@Override
	public String toString() {
		return "MatriculaDTO [nombreEstudiante=" + nombreEstudiante + ", nombreMateria=" + nombreMateria
				+ ", fechaMatricula=" + fechaMatricula + "]";
	}

}
