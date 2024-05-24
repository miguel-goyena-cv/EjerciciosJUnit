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
class FacturaTest {

	Factura facturaTest;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		// He creado productos
		String nombreProducto1 = "Ordenador";
		int cantidadProducto1 = 2;
		float precioProducto1 = 1000.45f;
		Product productoOrdenadores = new Product(nombreProducto1, precioProducto1, cantidadProducto1);
		String nombreProducto2 = "Movil";
		int cantidadProducto2 = 5;
		float precioProducto2 = 150.54f;
		Product productoMovil = new Product(nombreProducto2, precioProducto2, cantidadProducto2);

		// Creo la factura con los productos anteriores
		facturaTest = new Factura();
		facturaTest.meterProducto(productoOrdenadores);
		facturaTest.meterProducto(productoMovil);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13.Factura#meterProducto(org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13.Product)}.
	 */
	@Test
	void testMeterProducto() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13.Factura#calcularPrecio()}.
	 */
	@Test
	void testTotalFactura() {

		//Expected
		float precioTotalEsperado = 2753.6f; 
		
		//Actual
		float precioTotal = facturaTest.calcularPrecio();
		
		//Asserts
		assertEquals(precioTotalEsperado, precioTotal, "Calculo de precio total incorrecto");
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej13.Factura#aplicarIva(float)}.
	 */
	@Test
	void testAplicarIva() {
		
		//Expected
		float iva = 21f;
		float precioConIvaEsperado = 3331.86f;
		
		//Actual
		float precioConIva = facturaTest.aplicarIva(iva);
		
		//Asserts
		assertEquals(precioConIvaEsperado, precioConIva, "Calculo de precio con iva incorrecto");

		
	}

}
