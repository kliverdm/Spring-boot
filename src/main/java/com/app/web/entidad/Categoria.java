package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Categoria", nullable = false, length = 50, unique=true)
	private String Categoria;
	
	@Column(name="Descripcion", nullable = false, length = 2000)
	private String Descripcion;
	
	public Categoria() {}

	public Categoria(long id, String categoria, String descripcion) {
		super();
		this.id = id;
		Categoria = categoria;
		Descripcion = descripcion;
	}
	
	public Categoria(String categoria, String descripcion) {
		super();
		Categoria = categoria;
		Descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", Categoria=" + Categoria + ", Descripcion=" + Descripcion + "]";
	}
	
	
	
}
