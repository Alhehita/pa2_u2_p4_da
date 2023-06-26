package com.example.demo.service;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;

public interface LibroService {
	
public void guardar(Libro libro);
	
	public void actualizar(Libro libro);
	
	public Libro buscarPorTitulo(String titulo);
	
	public void borrar(String titulo);

}
