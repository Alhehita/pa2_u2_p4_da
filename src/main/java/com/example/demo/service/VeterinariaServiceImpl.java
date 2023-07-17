package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VeterinariaRepository;
import com.example.demo.repository.modelo.Animal;
import com.example.demo.repository.modelo.Veterinaria;

import jakarta.persistence.SequenceGenerator;

@Service
public class VeterinariaServiceImpl implements VeterinariaService {

	@Autowired
	private VeterinariaRepository veterinariaRepository;

	@Override
	public void guardar(Veterinaria veterinaria) {
		this.veterinariaRepository.insertar(veterinaria);
	}

	@Override
	public void actualizar(String nombre) {
		this.veterinariaRepository.actualizar(nombre);
	}

	@Override
	public List<Veterinaria> buscarVetJoin() {
		return this.veterinariaRepository.seleccionarVetJoin();
	}

	@Override
	public List<Animal> buscarAnimJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarAnimJoin();
	}

	@Override
	public List<Veterinaria> buscarVetRightJoin() {
		return this.veterinariaRepository.seleccionarVetRightJoin();
	}

	@Override
	public List<Animal> buscarAnimRightJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarAnimRightJoin();
	}

	@Override
	public List<Veterinaria> buscarVetLeftJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarVetLeftJoin();
	}

	@Override
	public List<Animal> buscarAnimLeftJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarAnimLeftJoin();
	}

	@Override
	public List<Veterinaria> buscarVetFullJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarVetFullJoin();
	}

	@Override
	public List<Animal> buscarAnimFullJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarAnimFullJoin();
	}

	@Override
	public List<Veterinaria> buscarVetWhereJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarVetWhereJoin();
	}

	@Override
	public List<Animal> buscarAnimWhereJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarAnimWhereJoin();
	}

	@Override
	public List<Veterinaria> buscarVetFetchJoin() {
		// TODO Auto-generated method stub
		return this.veterinariaRepository.seleccionarVetFetchJoin();
	}



}
