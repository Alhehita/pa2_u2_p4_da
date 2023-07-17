package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Animal;
import com.example.demo.repository.modelo.Veterinaria;

public interface VeterinariaService {
	
	public void guardar(Veterinaria veterinaria);

	public void actualizar(String nombre);
	
	public List<Veterinaria> buscarVetJoin();
	public List<Animal> buscarAnimJoin();
	
	public List<Veterinaria> buscarVetRightJoin();
	public List<Animal> buscarAnimRightJoin();
	
	public List<Veterinaria> buscarVetLeftJoin();
	public List<Animal> buscarAnimLeftJoin();
	
	public List<Veterinaria> buscarVetFullJoin();
	public List<Animal> buscarAnimFullJoin();
	
	public List<Veterinaria> buscarVetWhereJoin();
	public List<Animal> buscarAnimWhereJoin();
	
	public List<Veterinaria> buscarVetFetchJoin();

}
