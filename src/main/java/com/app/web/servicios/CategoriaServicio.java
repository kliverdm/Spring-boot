package com.app.web.servicios;

import java.util.List;

import com.app.web.entidad.*;
public interface CategoriaServicio {

	public List<Categoria> listarCategorias();
	
	public Categoria GuardarCategoriaOP(Categoria categoria);
	
	public Categoria SaveCategoria(Categoria categoria);
	
	public Categoria ObtenerCatID(Long id);
	
	public Categoria ActualizarCategoria(Categoria categoria);
	
	public void EliminarCategoria(Long id);
}
