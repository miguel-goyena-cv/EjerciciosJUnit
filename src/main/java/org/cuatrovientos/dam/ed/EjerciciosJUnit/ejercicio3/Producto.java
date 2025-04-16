package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicio3;

public class Producto {
	
	private String nombre;
	private float precio;
	private int cantidad;
	
	
	public Producto(String nombre, float precio, int cantidad) throws IllegalArgumentException {
		
		super();
		
		// Controlo los diferentes parametros de entrada
		// Nombres raros
		if (!nombre.matches("^[a-zA-Z]+$")) {
			throw new IllegalArgumentException("Nombre con caracteres diferentes a letras minusculas o mayusculas");
		}
		//Precios negativos
		if (precio<0) {
			throw new IllegalArgumentException("Precios mayores o igual a 0");
		}
		//Cantidades > 0
		if (cantidad<=0) {
			throw new IllegalArgumentException("Cantidades mayores a 0");
		}
		
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public float precioTotal() {
		return precio * cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
}
