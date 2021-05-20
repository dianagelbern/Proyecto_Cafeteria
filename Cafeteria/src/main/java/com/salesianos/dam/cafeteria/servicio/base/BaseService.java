package com.salesianos.dam.cafeteria.servicio.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Esta clase sirve de base para extender. Le da cuerpo a todos los m�todos.
 * Esta clase est� hecha de forma que pueda ser versatil, es decir,
 *  est� dise�ada para que funcione para cualquier tipo de entidad danto las funcionalidades CRUD del repositorio.
 *  Los distintos métodos por lo general son autodescriptivos, por lo tanto, (exceptuando alguno de ellos) por lo general no dejaré comentarios en ellos.
 * 
 * @author Diana Gonz�lez
 *
 * @param <T> Entidad
 * @param <ID> Id de la entidad
 * @param <R> Repositorio
 */
public abstract class BaseService<T, ID, R extends JpaRepository<T, ID>> {

	@Autowired
	/**
	 * Por medio de este le damos un mecanismo para que posteriormente se le pueda inyectar un repositorio autom�ticamente
	 * para poder hacer las distitnas operaciones CRUD.
	 */
	protected R repositorio;

	
	public BaseService(R repo) {
		this.repositorio = repo;
	}

	
	public T save(T t) {
		// TODO Auto-generated method stub
		return repositorio.save(t);
	}

	/**
	 * Si no encuentra un objeto por medio de su Id regresa null
	 * @param id
	 * @return El objeto o null 
	 */
	public T findById(ID id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}


	public List<T> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}


	public T edit(T t) {
		// TODO Auto-generated method stub
		return repositorio.save(t);
	}


	public void delete(T t) {
		// TODO Auto-generated method stub
		repositorio.delete(t);
	}

	
	
	public void deleteById(ID id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}
	
	
	
}
