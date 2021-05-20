package com.salesianos.dam.cafeteria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianos.dam.cafeteria.modelo.Categoria;
/**
 * Repositorio donde, por medio de los objetos se da acceso a datos de la categoría para las operaciones CRUD.
 * @author Diana González
 *
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
