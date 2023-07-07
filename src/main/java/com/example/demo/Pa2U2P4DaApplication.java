package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
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
import com.example.demo.repository.modelo.Veterinaria;
import com.example.demo.service.AnimalService;
import com.example.demo.service.AutorService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.VeterinariaService;

@SpringBootApplication
public class Pa2U2P4DaApplication implements CommandLineRunner {

	@Autowired
	VeterinariaService veterinariaService;

	@Autowired
	AnimalService animalService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Veterinaria veterinaria = new Veterinaria();
		Animal animal = new Animal();

		animal.setFechaNacimiento(LocalDate.of(2013, 11, 13));
		animal.setNombre("Scott");
		animal.setPeso(14.5);
		animal.setRaza("Mestizo");
		animal.setTipo("Perro");

		Animal animal1 = new Animal();

		animal1.setFechaNacimiento(LocalDate.of(2012, 07, 15));
		animal1.setNombre("Luna");
		animal1.setPeso(13.5);
		animal1.setRaza("Mestizo");
		animal1.setTipo("Perro");

		Animal animal2 = new Animal();

		animal2.setFechaNacimiento(LocalDate.of(2022, 06, 21));
		animal2.setNombre("Manchos");
		animal2.setPeso(3.6);
		animal2.setRaza("Mestizo");
		animal2.setTipo("Gato");

		Animal animal3 = new Animal();

		animal3.setFechaNacimiento(LocalDate.of(2022, 06, 21));
		animal3.setNombre("Ceni");
		animal3.setPeso(3.4);
		animal3.setRaza("Mestizo");
		animal3.setTipo("Gato");

		List<Animal> animales = new ArrayList<>();
		animales.add(animal);
		animales.add(animal1);
		animales.add(animal2);
		animales.add(animal3);

		veterinaria.setTlfno("2938576");
		veterinaria.setTipoConsulta("Control");
		veterinaria.setPrecioConsulta(new BigDecimal(15));
		veterinaria.setNombre("Veterinaria La Planada");
		veterinaria.setDireccion("Colinas del norte");
		veterinaria.setAnimales(animales);

		animal.setVeterinaria(veterinaria);

		// veterinariaService.guardar(veterinaria);

		//List<Animal> animal5 = this.animalService.seleccionarAnimalDinamico("Ceni", "Gato", LocalDate.now());

		int borrar = animalService.borrarAnimalPorN("Ceni");
		
		System.out.println(borrar);
		
		int actualizar = animalService.actualizarPorPeso(15.8, "Scott");
		
		System.out.println(actualizar);
	}
}
