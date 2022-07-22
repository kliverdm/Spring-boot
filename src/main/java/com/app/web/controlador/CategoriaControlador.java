package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Categoria;
import com.app.web.servicios.CategoriaServicio;

@Controller
public class CategoriaControlador {

	@Autowired
	private CategoriaServicio servicio;

	@GetMapping("/categoria")
	public String listarCategoria(Model modelo) {
		modelo.addAttribute("categoria", servicio.listarCategorias());
		return "categoria";
	}

	@GetMapping("/categoria/nuevo")
	public String crearcategoriaformuario(Model modelo) {
		Categoria categoria = new Categoria();
		modelo.addAttribute("categoria", categoria);
		return "Crear_Categoria";
	}
		//GUARDAR
	@PostMapping("/categoria")
	public String GuardarCategoria(@ModelAttribute("categoriat") Categoria cat) {
		servicio.SaveCategoria(cat);
		return "redirect:/categoria";
	}

		//FORMULARIO DE EDITAR
	@GetMapping("/categoria/editar/{id}")
	public String FormularioEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("categoria", servicio.ObtenerCatID(id));
		return "Editar_Categoria";
	}
		//EDITAR
	@PostMapping("/categoria/{id}")
	public String ActualizarCategoria(@PathVariable Long id, @ModelAttribute("categoriat") Categoria cat, Model model) {
		Categoria CatExistente = servicio.ObtenerCatID(id);
		CatExistente.setId(id);
		CatExistente.setCategoria(cat.getCategoria());
		CatExistente.setDescripcion(cat.getDescripcion());

		servicio.ActualizarCategoria(CatExistente);
		return "redirect:/categoria";
	}
	
	
		//ELIMINAR
	@GetMapping("/categoria/{id}")
	public String EliminarCategoria(@PathVariable Long id) {
		servicio.EliminarCategoria(id);
		return "redirect:/categoria";
	}

}
