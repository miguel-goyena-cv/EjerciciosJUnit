package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13;

public class Product {

	private String nombre;
	private float precio;
	private int cantidad;

	public Product(String nombre, float precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Product [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	/**
	 * Calcula el precio total del producto, teniendo en cuenta la cantidad y su
	 * precio unitario
	 * 
	 * @return
	 */
	public float precioTotal() {

		return cantidad*precio;
	}

}
