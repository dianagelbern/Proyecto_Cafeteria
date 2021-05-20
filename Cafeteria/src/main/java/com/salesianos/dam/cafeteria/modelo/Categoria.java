package com.salesianos.dam.cafeteria.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
/**
 * Clase modelo de las distintas categor�as a las cuales pertenecen los productos
 * @author Diana González
 *
 */
public class Categoria {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	private String imagen;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy="categoria")
	private List<Producto> producto = new ArrayList<>();
	
	
	public Categoria(String nombre, String imagen) {
		this.nombre = nombre;
		this.imagen = imagen;
	}
	
	
	public void addProducto(Producto p) {
		this.producto.add(p);
		p.setCategoria(this);
	}
	
	public void removeProducto(Producto p) {
		this.producto.remove(p);
		p.setCategoria(null);
	}
}