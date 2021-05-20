package com.salesianos.dam.cafeteria.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
/**
 * Clase modelo de los distintos productos de la tienda.
 * Se vincula con una base de datos por medio de sus anotaciones, los distintos atributos son las columnas que tendrá
 * la clave primaria sería el anotado con @id.
 * @author Diana González
 *
 */
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	private String nombre;
	private double pvp;
	private String descripcion;
	private String imagen;
	
	@ManyToOne
	private Categoria categoria;
	
	public Producto(String n, double p, String d, String i) {
		this.nombre = n;
		this.pvp = p;
		this.descripcion = d;
		this.imagen = i;
	}
	
	
	public Producto(String nombre, double pvp, String descripcion, String imagen, Categoria categoria) {
		this.nombre = nombre;
		this.pvp = pvp;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.categoria = categoria;
	}
	
	
	
}
