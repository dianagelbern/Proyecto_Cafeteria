package com.salesianos.dam.cafeteria.servicio;

import org.springframework.stereotype.Service;

import com.salesianos.dam.cafeteria.modelo.Categoria;
import com.salesianos.dam.cafeteria.repositorio.CategoriaRepository;
import com.salesianos.dam.cafeteria.servicio.base.BaseService;

@Service
/**
 * Extiende de BaseService con sus respectivos tipos de datos.
 * inyecta el repositorio de la categoria y lo utiliza en las diferentes operaciones CRUD
 * @author Diana González
 *
 */
public class CategoriaServicio extends BaseService<Categoria, Long, CategoriaRepository> {

	public CategoriaServicio(CategoriaRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
