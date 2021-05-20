package com.salesianos.dam.cafeteria;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesianos.dam.cafeteria.modelo.Categoria;
import com.salesianos.dam.cafeteria.modelo.Producto;
import com.salesianos.dam.cafeteria.servicio.CategoriaServicio;
import com.salesianos.dam.cafeteria.servicio.ProductoServicio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
/**
 * Clase que contiene los diferentes datos tanto de los productos como de las categoriás
 * @author Diana González
 *
 */
public class InitData {

	private final ProductoServicio productoservicio;
	private final CategoriaServicio categoriaservicio;
	
	@PostConstruct
	public void init() {
			
			//Espresso
			Categoria espresso = new Categoria("Espresso", "https://www.starbucks.es/media/Caf%C3%A9-latte_tcm31-53348_w1024_n.jpg");
		
			categoriaservicio.save(espresso);
			
			List<Producto> cafes = Arrays.asList(new Producto("Café americano", 2.20, "Delicioso café americano", "https://www.starbucks.es/media/Starbucks-Blonde-Americano_tcm31-53275_w1024_n.jpg"),
					new Producto("Latte Macchiato", 2.30, "Bebida preparada con leche y café expreso", "https://www.starbucks.es/media/Latte-Macchiato_tcm31-53349_w1024_n.jpg"),
					new Producto("Cappuccino Freddo", 3.10, "Espresso con hielo, ligeramente dulce y coronado con una suave y cremosa leche", "https://www.starbucks.es/media/CappuccinoFreddo_tcm31-53350_w1024_n.jpg"));
		
			
			for(Producto p : cafes)
				productoservicio.save(p);
			
			cafes.forEach((p) -> {
				espresso.addProducto(p);
				productoservicio.edit(p);
			});
			
			//InfusiónGG
			Categoria infusion = new Categoria("Infusión", "https://www.starbucks.es/media/vanillaRoobois-pt_tcm31-11320_w1024_n.jpg");
			
			categoriaservicio.save(infusion);
			
			List <Producto> infusiones = Arrays.asList(new Producto("Chai Tea", 1.20, "Consiste en una mezcla de té con especias y hierbas aromáticas.​​", "https://www.starbucks.es/media/Asset-Chai-Tea_tcm31-1367_w1024_n.jpg"),
					new Producto("Earl Grey", 2.10, "Mezcla de té aromatizada con aceite de bergamota.", "https://www.starbucks.es/media/drinks-earl-gray-brewed-tea-menu-asset_tcm31-9939_w1024_n.jpg"),
					new Producto("Vanilla Roiboos Tea", 2.30, "Infusión a base de vainila", "https://www.starbucks.es/media/vanillaRoobois-pt_tcm31-11320_w1024_n.jpg"));
			
			for(Producto p : infusiones)
				productoservicio.save(p);
			
			infusiones.forEach((p) -> {
				infusion.addProducto(p);
				productoservicio.edit(p);
			});
			
			
			//Chocolates
			
			Categoria chocolate = new Categoria("Chocolate", "https://www.starbucks.es/media/Chocolate-caliente_tcm31-53360_w1024_n.jpg");
			
			categoriaservicio.save(chocolate);
			
			List <Producto> chocolates = Arrays.asList(new Producto("Chocolate Caramelo", 2.20, "Deliciosa bebida achocolatada con un toque de caramelo", "https://www.starbucks.es/media/Chocolate-caramelo_tcm31-53361_w1024_n.jpg"),
					new Producto("Chocolate Avellana", 3.10, "Deliciosa bebida achocolatada con avellanas", "https://www.starbucks.es/media/Chocolate-avellana_tcm31-54713_w1024_n.jpg"));
			
			for(Producto p : chocolates)
				productoservicio.save(p);
			
			chocolates.forEach((p) -> {
				chocolate.addProducto(p);
				productoservicio.edit(p);
			});
			
			
			
			//Tartas
			
			Categoria tarta = new Categoria("Tarta", "https://www.starbucks.es/media/food-tarts-apple-cheesecake_tcm31-10860_w1024_n.jpg");
			
			categoriaservicio.save(tarta);
			
			List <Producto> tartas = Arrays.asList(new Producto("Carrot Cake", 3.10, "Deliciosa tarta hecha a base de zanahorias", "https://www.starbucks.es/media/food-tarts-carrot-cake_tcm31-10862_w1024_n.jpg"),
					new Producto("Chocolate Cake", 3.10, "Deliciosa tarta a base de chocolate", "https://www.starbucks.es/media/food-tarts-chocolate-cake_tcm31-10863_w1024_n.jpg"),
					new Producto("Cheesecake de Frambuesa", 2.90, "Cheesecake con trozos de mermelada de frambuesa", "https://www.starbucks.es/media/food-tarts-raspberry-cheesecake_tcm31-10864_w1024_n.jpg"));
			
			for(Producto p : tartas)
				productoservicio.save(p);
			
			tartas.forEach((p) -> {
				tarta.addProducto(p);
				productoservicio.edit(p);
			});
			
			
			//Cookies
			
			Categoria cookie = new Categoria("Cookie", "https://www.starbucks.es/media/food-cookies-chocolate-chip_tcm31-10867_w1024_n.jpg");
			
			categoriaservicio.save(cookie);
			
			List <Producto> cookies = Arrays.asList(new Producto("Cookie de Chocolate", 1.70, "Deliciosa galleta con chispas de chocolate", "https://www.starbucks.es/media/food-cookies-chocolate-chip_tcm31-10867_w1024_n.jpg"),
					new Producto("Cookie Chocolate Blanco y Nuez", 1.90, "Deliciosa galleta con chocolate blanco y trozos de nuez", "https://www.starbucks.es/media/food-cookies-white-and-walnut_tcm31-10868_w1024_n.jpg"));
			
			for(Producto p : cookies)
				productoservicio.save(p);
			
			cookies.forEach((p) -> {
				cookie.addProducto(p);
				productoservicio.edit(p);
			});
			
			
			//Muffins
			Categoria muffin = new Categoria("Muffin", "https://www.starbucks.es/media/food-muffins-strawberry-white-chocolate_tcm31-10856_w1024_n.jpg");
			
			categoriaservicio.save(muffin);
			
			List <Producto> muffins = Arrays.asList(new Producto("Muffin Integral de Manzana", 1.20, "Delicioso muffin a base de manzana", "https://www.starbucks.es/media/food-muffins-integral-apple_tcm31-10855_w1024_n.jpg"),
					new Producto("Mini Muffin Supreme de Chocolate", 1.90, "Delicioso muffin con relleno de chocolate", "https://www.starbucks.es/media/food-muffins-supreme-chocolate-chip_tcm31-10853_w1024_n.jpg"),
					new Producto("Muffin Vainilla y Chocolate", 1.90, "Delicioso muffin con chispas de chocolate sabor vainilla", "https://www.starbucks.es/media/food-muffins-vanilla-chocolate_tcm31-10858_w1024_n.jpg"));
			
		
			for(Producto p : muffins)
				productoservicio.save(p);
			
			muffins.forEach((p) -> {
				muffin.addProducto(p);
				productoservicio.edit(p);
			});
		
		
		
		
		};
	}


