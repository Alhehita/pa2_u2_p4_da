package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Animal;

public interface AnimalRepository {

	public void insertar(Animal animal);

	public void actualizar(String nombre);

	public Animal seleccionarPorNombre(String nombre);

	public List<Animal> seleccionarListaPorTipo(String tipo);

	public Animal seleccionarPorNombreTyped(String nombre);

	public List<Animal> seleccionarListaPorTipoTyped(String tipo);

	public List<Animal> seleccionarAnimalDinamico(String nombre, String tipo, LocalDate fecha);

	public int eliminarAnimalPorN(String nombre);

	public int actualizarPorPeso(Double peso, String nombre);

}
