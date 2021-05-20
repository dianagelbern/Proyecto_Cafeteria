package com.salesianos.dam.cafeteria.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianos.dam.cafeteria.modelo.Categoria;
import com.salesianos.dam.cafeteria.modelo.Producto;
/**
 * Repositorio donde, por medio de los objetos se da acceso a datos del producto para las operaciones CRUD.
 * @author Diana González
 *
 */
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
	public List<Producto> findByCategoria(Categoria categoria);
	
	
	public List<Producto> findByCategoriaId(Long categoriaId);
	
	
	
	
}
