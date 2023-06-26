package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {
	
	public void insertar(Estudiante estudiante);
		
	public void eliminar(String cedula);
	
	public void actualizar(Estudiante estudiante);
	
	public Estudiante seleccionarPorNumero(String cedula);
	
	public Estudiante seleccionarPorApellido(String apellido);

	public Estudiante seleccionarPorApellidoTyped(String apellido);

	public Estudiante seleccionarPorApellidoYNombre(String apellido, String nombre);
	
	public List<Estudiante> seleccionarListaPorApellido(String apellido);

	public List<Estudiante> seleccionarListaPorApellidoTyped(String apellido);

	

}
