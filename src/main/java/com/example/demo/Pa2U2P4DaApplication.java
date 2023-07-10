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
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Veterinaria;
import com.example.demo.service.AnimalService;
import com.example.demo.service.AutorService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.VeterinariaService;

@SpringBootApplication
public class Pa2U2P4DaApplication implements CommandLineRunner {

	@Autowired
	EstudianteService estudianteService;

	@Autowired
	MatriculaService matriculaService;

	@Autowired
	HotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// System.out.println(this.matriculaService.buscarTodos());

		Hotel hotel = new Hotel();

		hotel.setDireccion("Av. Naciones Unidas");

		hotel.setNombre("Hotel Plaza 1");

		Habitacion habitacion = new Habitacion();

		habitacion.setHotel(hotel);
		habitacion.setNumeroHab("34");
		habitacion.setValor(new BigDecimal(45));

		Habitacion habitacion1 = new Habitacion();

		habitacion1.setHotel(hotel);
		habitacion1.setNumeroHab("37");
		habitacion1.setValor(new BigDecimal(48));

		Habitacion habitacion2 = new Habitacion();

		habitacion2.setHotel(hotel);
		habitacion2.setNumeroHab("54");
		habitacion2.setValor(new BigDecimal(59));

		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(habitacion);
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);

		hotel.setHabitaciones(habitaciones);

		// this.hotelService.guardar(hotel);
		// this.hotelService.buscarPorIdNombre(2);

		System.out.println(this.matriculaService.buscarTodosPorFecha());
		

	}
}
