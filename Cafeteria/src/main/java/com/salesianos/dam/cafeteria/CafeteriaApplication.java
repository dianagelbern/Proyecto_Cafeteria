package com.salesianos.dam.cafeteria;

import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.URL;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianos.dam.cafeteria.modelo.Categoria;
import com.salesianos.dam.cafeteria.modelo.Producto;
import com.salesianos.dam.cafeteria.servicio.CategoriaServicio;
import com.salesianos.dam.cafeteria.servicio.ProductoServicio;

/**
 * <h1>Cafetería</h1>
 * Aplicación web que consiste en la gestión de los productos de una cafetería.
 * <p>
 * En esta aplicación se podrán hacer las operaciones de insertar, buscar, modificar, borrar, consultar, mostrar y filtrar en torno a los productos de
 * la tienda.
 * 
 * @author Diana González
 * @version 1.0
 * @since 2021
 *
 */

@SpringBootApplication
public class CafeteriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafeteriaApplication.class, args);
	}	
	
	
}
