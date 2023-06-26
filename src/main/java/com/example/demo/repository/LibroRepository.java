package com.example.demo.repository;

import com.example.demo.repository.modelo.Libro;

public interface LibroRepository {

	public void insertar(Libro libro);

	public void actualizar(Libro libro);

	public Libro seleccionarPorTitulo(String titulo);

	public void eliminar(String titulo);

}
