package com.salesianos.dam.cafeteria.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianos.dam.cafeteria.modelo.Categoria;
import com.salesianos.dam.cafeteria.modelo.Producto;
import com.salesianos.dam.cafeteria.repositorio.ProductoRepository;
import com.salesianos.dam.cafeteria.servicio.base.BaseService;

import lombok.Data;

@Service
/**
 * Extiende de BaseService con sus respectivos tipos de datos.
 * inyecta el repositorio del producto y lo utiliza en las diferentes operaciones CRUD
 * @author Diana González
 *
 */
public class ProductoServicio extends BaseService<Producto, Long, ProductoRepository> {

	public ProductoServicio(ProductoRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}
	
	public List<Producto> findAllByCategoria(Categoria categoria) {
		return repositorio.findByCategoria(categoria);
	}
	
	public List<Producto> findAllByCategoriaId(Long categoriaId) {
		return repositorio.findByCategoriaId(categoriaId);
	}
	
	
	
}
