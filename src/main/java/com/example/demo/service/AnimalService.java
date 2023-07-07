package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Animal;

public interface AnimalService {

	public void guardar(Animal animal);

	public void actualizar(String nombre);

	public Animal buscarPorNombre(String nombre);

	public List<Animal> buscarListaPorTipo(String tipo);

	public Animal buscarPorNombreTyped(String nombre);

	public List<Animal> buscarListaPorTipoTyped(String tipo);
	
	public List<Animal> seleccionarAnimalDinamico(String nombre, String tipo, LocalDate fecha) ;

}
