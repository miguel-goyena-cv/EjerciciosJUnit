/**
 * 
 */
package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class CadenaTest {

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
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej11.Cadena#longitud(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	void testLongitud() throws Exception {
		
		Cadena nuestraCadena = new Cadena();
		
		//Expected
		String cadenaTest = "dam";
		int expected = 3;
		String cadenaVacia = null;
		String expectedMessage = "Cadena vacia";
		Exception expectedException = new Exception(expectedMessage);
		
		//Actual
		int actual = nuestraCadena.longitud(cadenaTest);
		Exception actualException = null;
		try {
			nuestraCadena.longitud(cadenaVacia);
		}
		catch (Exception e) {
			actualException = e;
		}
		
		//Assert
		assertEquals(expected, actual,"Longitud de cadena no calculada correctamente");
		assertEquals(expectedException.getMessage(), actualException.getMessage(), "No hay control de nulos en la cadena");
		
//		// Other WAY
//		Exception thrown = assertThrows(Exception.class, () -> {
//			nuestraCadena.longitud(null);
//		});
//		assertEquals(thrown.getMessage(), expectedMessage);
		
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej11.Cadena#vocales(java.lang.String)}.
	 */
	@Test
	void testVocales() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej11.Cadena#invertir(java.lang.String)}.
	 */
	@Test
	void testInvertir() {

		Cadena cadena = new Cadena();

		//Expected
		String cadenaEntradaCompleta = "hola";
		String cadenaEntradaVacia = "";
		String cadenaEntradaNula = null;
		String cadenaSalidaCompleta = "aloh";
		String cadenaSalidaVacia = "";
		//String cadenaSalidaNula = null;
		
		//Actual
		String actualCompleta = cadena.invertir(cadenaEntradaCompleta);
		String actualVacia = cadena.invertir(cadenaEntradaVacia);
		String actualNula = cadena.invertir(cadenaEntradaNula);
		
		//Asserts
		assertEquals(cadenaSalidaCompleta, actualCompleta,"Cadenas completas no invertidas correctamente");
		assertEquals(cadenaSalidaVacia, actualVacia,"No se ha tenido en cuenta las cadenas vacias");
		assertNull(actualNula);
		
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej11.Cadena#contarLetra(java.lang.String, char)}.
	 */
	@Test
	void testContarLetra() {
		fail("Not yet implemented");
	}

}
