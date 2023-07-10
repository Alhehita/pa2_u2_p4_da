package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepositoryImpl implements HotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel hotel) {
		this.entityManager.persist(hotel);
	}

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto- method stub
	//	Hotel hotel = new Hotel();
		//hotel.getHabitaciones().size();
		return this.entityManager.find(Hotel.class, id.SIZE);
	}

	@Override
	public void eliminar(Integer id) {
		Hotel hotel = this.seleccionar(id);
		this.entityManager.remove(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.entityManager.merge(hotel);
	}

	

	

}
