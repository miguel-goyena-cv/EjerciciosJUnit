/**
 * 
 */
package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ProductTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13.Product#Product(java.lang.String, float, int)}.
	 */
	@Test
	void testNuevo() {
		
		//Expected
		String nombreProducto = "Ordenador";
		int cantidadProducto = 2;
		float precioProducto = 1000.45f;
		
		//Actual
		Product nuevoProducto = new Product(nombreProducto, precioProducto, cantidadProducto);
		
		// Asserts
		assertEquals(nuevoProducto.getNombre(), nombreProducto);
	}
	
	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13.Product#precioTotal()}.
	 */
	@Test
	void testPrecioTotal() {
		
		//Expected
		String nombreProducto = "Ordenador";
		int cantidadProducto = 2;
		float precioProducto = 1000.45f;
		float precioEsperado = 2000.90f;
		
		//Actual
		Product nuevoProducto = new Product(nombreProducto, precioProducto, cantidadProducto);
		float precioActual = nuevoProducto.precioTotal();
		
		// Asserts
		assertEquals(precioEsperado, precioActual, "Calculo del precio total es malo");
		
		
		//Expected
		nombreProducto = "Ordenador";
		cantidadProducto = 0;
		precioProducto = 1f;
		precioEsperado = 0f;
		
		//Actual
		nuevoProducto = new Product(nombreProducto, precioProducto, cantidadProducto);
		precioActual = nuevoProducto.precioTotal();
		
		// Asserts
		assertEquals(precioEsperado, precioActual, "Calculo del precio total es malo, no hay control de los 0");
		
	}
	
	

}
