package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

public interface EstudianteService {
	
	public void guardar(Estudiante estudiante);
	
	public void borrar(String cedula);
	
	public void actualizar(Estudiante estudiante);
	
	public Estudiante buscarPorNumero(String cedula);
	
	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorApellidoTyped(String apellido);

	public List<Estudiante> reportePorApellido(String apellido);
	
	public Estudiante buscarPorApellidoYNombre(String apellido, String nombre);
	
	public List<Estudiante> reportePorApellidoTyped(String apellido);
	
	

	public Estudiante buscarPorApellidoNamed(String apellido);
	
	public Estudiante buscarPorApellidoNamedQuery(String apellido);
	
	public Estudiante buscarPorApellidoNativeQuery(String apellido);
	
	public Estudiante buscarPorApellidoNativeQueryNamed(String apellido);

	public Estudiante buscarPorNombreNamedQuery(String nombre);

	public Estudiante buscarPorNombreNativeQueryNamed(String nombre);
	
	public Estudiante buscarPorApellidoCriteriaAPIQuery(String apellido);

	
	public List<EstudianteDTO> buscarTodosDTO();



}
