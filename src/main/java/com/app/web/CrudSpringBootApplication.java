package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Categoria;
import com.app.web.repositorio.CategoriaRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
	
	@Autowired
	private CategoriaRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
	
		/*Categoria c = new Categoria("otro","otros");
		repositorio.save(c);
		*/
	}

}
