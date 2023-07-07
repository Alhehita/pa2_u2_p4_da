package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AnimalRepository;
import com.example.demo.repository.modelo.Animal;

@Service
public class AnimaleServiceImpl implements AnimalService {

	@Autowired
	private AnimalRepository animalRepository;

	@Override
	public void guardar(Animal animal) {
		this.animalRepository.insertar(animal);
	}

	@Override
	public void actualizar(String nombre) {
		this.animalRepository.actualizar(nombre);
	}

	@Override
	public Animal buscarPorNombre(String nombre) {
		return this.animalRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public List<Animal> buscarListaPorTipo(String tipo) {
		return this.animalRepository.seleccionarListaPorTipo(tipo);
	}

	@Override
	public Animal buscarPorNombreTyped(String nombre) {
		return this.animalRepository.seleccionarPorNombreTyped(nombre);
	}

	@Override
	public List<Animal> buscarListaPorTipoTyped(String tipo) {
		return this.animalRepository.seleccionarListaPorTipoTyped(tipo);
	}

	@Override
	public List<Animal> seleccionarAnimalDinamico(String nombre, String tipo, LocalDate fecha) {
		return this.animalRepository.seleccionarAnimalDinamico(nombre, tipo, fecha);
	}

}
