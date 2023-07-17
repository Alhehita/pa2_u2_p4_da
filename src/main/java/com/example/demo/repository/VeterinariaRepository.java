package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Animal;
import com.example.demo.repository.modelo.Veterinaria;

public interface VeterinariaRepository {

	public void insertar(Veterinaria veterinaria);

	public void actualizar(String nombre);
	
	public List<Veterinaria> seleccionarVetJoin();
	public List<Animal> seleccionarAnimJoin();
	
	public List<Veterinaria> seleccionarVetRightJoin();
	public List<Animal> seleccionarAnimRightJoin();
	
	public List<Veterinaria> seleccionarVetLeftJoin();
	public List<Animal> seleccionarAnimLeftJoin();
	
	public List<Veterinaria> seleccionarVetFullJoin();
	public List<Animal> seleccionarAnimFullJoin();
	
	public List<Veterinaria> seleccionarVetWhereJoin();
	public List<Animal> seleccionarAnimWhereJoin();

	public List<Veterinaria> seleccionarVetFetchJoin();


}
