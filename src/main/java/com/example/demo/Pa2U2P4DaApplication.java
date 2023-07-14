package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Animal;
import com.example.demo.repository.modelo.Veterinaria;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.VeterinariaService;

@SpringBootApplication
public class Pa2U2P4DaApplication implements CommandLineRunner {

	@Autowired
	EstudianteService estudianteService;

	@Autowired
	VeterinariaService veterinariaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
	List<Veterinaria> vet1 = this.veterinariaService.buscarVetJoin();
	List<Veterinaria> vet2 = this.veterinariaService.buscarVetRightJoin();
	List<Veterinaria> vet3 = this.veterinariaService.buscarVetLeftJoin();
	List<Veterinaria> vet4 = this.veterinariaService.buscarVetFullJoin();
	List<Veterinaria> vet5 = this.veterinariaService.buscarVetWhereJoin();

	for(Veterinaria vet10 : vet1) {
		System.out.println(vet10);
	}
	
	for(Veterinaria vet10 : vet2) {
		System.out.println(vet10);
	}
	
	for(Veterinaria vet10 : vet3) {
		System.out.println(vet10);
	}
	
	for(Veterinaria vet10 : vet4) {
		System.out.println(vet10);
	}
	
	for(Veterinaria vet10 : vet5) {
		System.out.println(vet10);
	}
	
	List<Animal> anim1 = this.veterinariaService.buscarAnimJoin();
	List<Animal> anim2 = this.veterinariaService.buscarAnimRightJoin();
	List<Animal> anim3 = this.veterinariaService.buscarAnimLeftJoin();
	List<Animal> anim4 = this.veterinariaService.buscarAnimFullJoin();
	List<Animal> anim5 = this.veterinariaService.buscarAnimWhereJoin();

	for(Animal anim10 : anim1) {
		System.out.println(anim10);
	}
	
	for(Animal anim10 : anim2) {
		System.out.println(anim10);
	}
	
	for(Animal anim10 : anim3) {
		System.out.println(anim10);
	}
	
	for(Animal anim10 : anim4) {
		System.out.println(anim10);
	}
	
	for(Animal anim10 : anim5) {
		System.out.println(anim10);
	}
	
	
	}
}
