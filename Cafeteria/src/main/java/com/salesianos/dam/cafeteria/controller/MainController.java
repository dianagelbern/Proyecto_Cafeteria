package com.salesianos.dam.cafeteria.controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianos.dam.cafeteria.modelo.Categoria;
import com.salesianos.dam.cafeteria.modelo.Producto;
import com.salesianos.dam.cafeteria.servicio.CategoriaServicio;
import com.salesianos.dam.cafeteria.servicio.ProductoServicio;

import lombok.RequiredArgsConstructor;

/**
 * Esta clase se encarga de atender las peticiones y devuelve los resultados a la vista.
 * @author Diana Gonz�lez
 *
 */

@RequiredArgsConstructor
@Controller
public class MainController {
	
	/**
	 * Se inyectan los objetos que hacen falta para los distintos m�todos
	 */
	private final ProductoServicio productoS;
	private final CategoriaServicio categoriaS;
	
	/**
	 * A�ade la lista de todos los productos
	 * @param model
	 * @return retorna la lista actualizada de productos
	 */
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("listaProductos", productoS.findAll());
		return "index";
	}

	
	/**
	 * Lista a los productos que coincidan con cierta categoría
	 * @param id
	 * @param model
	 * @return retorna la lista de productos pertenecientes al id seleccionado
	 */
	@GetMapping("/productos/categoria/{id}")
	public String productosCat(@PathVariable("id") Long id, Model model) {
		model.addAttribute("listaProductos", productoS.findAllByCategoriaId(id));					
		return "index";
	}
	

	
	/**
	 * Muestra el formulario con los distintos atributos del producto entre los cuales se encuentra la categor�a
	 * @param model
	 * @return retorna el formulario que se debe rellenar
	 */
	@GetMapping("/nuevo")
	public String showForm(Model model) {
		model.addAttribute("categorias", categoriaS.findAll());
		model.addAttribute("producto", new Producto());
		return "form";
	}
	
	/**
	 * Actualiza la lista de productos a�adiendo la hecha en el formulario
	 * @param nuevo
	 * @return redirige al index con la lista actualizada
	 */
	@PostMapping("/submit")
	public String processForm(@ModelAttribute("producto") Producto nuevo) {
		productoS.save(nuevo);
		return "redirect:/";
	}
	
	
	/**
	 * Edita un producto por medio de su id
	 * @param id
	 * @param model
	 * @return redirige a la página principal
	 */
	@GetMapping("/editar/{id}") 
	public String editarProducto(@PathVariable("id") Long id, Model model) {
		Producto producto = productoS.findById(id);
		
		if (producto != null) {
			model.addAttribute("producto", producto);
			model.addAttribute("categorias", categoriaS.findAll());
			return "form";
		}else {
			return "redirect:/";
		}
	}
	
	/**
	 * Borra un producto por medio de su id
	 * @param id
	 * @param model
	 * @return redirige a la p�gina principal
	 */
	@GetMapping("/borrar/{id}")
	public String borrarProducto(@PathVariable("id") Long id, Model model) {
		Producto producto = productoS.findById(id);
		
			if(producto != null) {
				productoS.delete(producto);
			}
			return "redirect:/";
		
	}
	
	/**
	 * Método que devuelve una lista de todas las categorías, su función es no repetir la misma linea de código en otros métodos
	 * @return Muestra todas las categorías
	 */
	@ModelAttribute("categorias")
	public List<Categoria> todasLasCategorias() {
		return categoriaS.findAll();
	}
	
	
	
	
}
