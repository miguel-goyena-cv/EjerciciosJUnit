package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13;

import java.util.Vector;

public class Factura {
	
	private Vector<Product> productos = new Vector<Product>();
	
	public void meterProducto(Product nuevoProducto) {
		productos.add(nuevoProducto);
	}
	
	public float calcularPrecio() {
		
		float precioTotal = 0;
		
		for (Product producto: productos) {
			precioTotal = precioTotal + producto.precioTotal();
		}
		
		return precioTotal;
	}
	
	public float aplicarIva(float iva) {
		float precioSinRedondear = this.calcularPrecio()*121/100;
		return Math.round(precioSinRedondear*100.0f)/100.0f;
	}

}
