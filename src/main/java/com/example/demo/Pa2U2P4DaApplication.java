package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Animal;
import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.AnimalService;
import com.example.demo.service.AutorService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4DaApplication implements CommandLineRunner {

	@Autowired
	AnimalService animalService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		animal.setNombre("Misi");
		animal.setTipo("Gato");

		Animal animal2 = new Animal();
		animal2.setNombre("Sirius");
		animal2.setTipo("Perro");

		Animal animal3 = new Animal();
		animal3.setNombre("Ceni");
		animal3.setTipo("Gato");

		Animal animal4 = new Animal();
		animal4.setNombre("Scott");
		animal4.setTipo("Perro");

		this.animalService.buscarPorNombre("Misi");

		List<Animal> reporte = this.animalService.buscarListaPorTipo("Gato");
		System.out.println("Reporte de todos los gatos ");
		for (Animal animal0 : reporte) {
			System.out.println(animal0);
		}

		this.animalService.buscarPorNombre("Sirius");

		List<Animal> reporte2 = this.animalService.buscarListaPorTipo("Perro");
		System.out.println("Reporte de todos los perros ");
		for (Animal animal5 : reporte2) {
			System.out.println(animal5);
		}

	}

}
