package com.app.web.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Categoria;
import com.app.web.repositorio.CategoriaRepositorio;

@Service
public class CategoriaServiciosMPL implements CategoriaServicio{

	@Autowired
	private CategoriaRepositorio repositorio;
	
	@Override
	public List<Categoria> listarCategorias() {
		return repositorio.findAll();
	}

	@Override
	public Categoria GuardarCategoriaOP(Categoria categoria) {
		return repositorio.save(categoria);
	}

	@Override
	public Categoria SaveCategoria(Categoria categoria) {
		return repositorio.save(categoria);
	}

	@Override
	public Categoria ObtenerCatID(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Categoria ActualizarCategoria(Categoria categoria) {
		return repositorio.save(categoria);
	}

	@Override
	public void EliminarCategoria(Long id) {
		repositorio.deleteById(id);
	}

	

	

	

}
