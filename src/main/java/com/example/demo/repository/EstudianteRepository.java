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

	
	
	
	public Estudiante seleccionarPorApellidoNamed(String apellido);

	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);

	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);

	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);

	public Estudiante seleccionarPorNombreNamedQuery(String nombre);

	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);

	public Estudiante seleccionarPorApellidoCriteriaAPIQuery(String apellido);
}
