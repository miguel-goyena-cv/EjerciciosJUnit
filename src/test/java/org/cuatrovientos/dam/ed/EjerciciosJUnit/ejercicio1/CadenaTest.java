package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CadenaTest {

	@Test
	void testLongitudOK() {
		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("goyena");
		
		// 2 Expected
		int expected = 6;
		
		// 3 Actual
		int actual = cadenaATestear.longitud();
		
		// 4 Asserts
		assertEquals(expected, actual, "No conseguimos longitudes esperadas con cadena Goyena");
	}
	
	
	@Test
	void testLongitudNulos() {
		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("");
		
		// 2 Expected
		int expected = 0;
		
		// 3 Actual
		int actual = cadenaATestear.longitud();
		
		// 4 Asserts
		assertEquals(expected, actual, "No conseguimos longitudes esperadas con cadena vacia");
	}
	
	@Test
	void testLongitudLetrasDobles() {
		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("coche");
		
		// 2 Expected
		int expected = 4;
		
		// 3 Actual
		int actual = cadenaATestear.longitud();
		
		// 4 Asserts
		assertEquals(expected, actual, "No conseguimos longitudes esperadas con cadena que tienen letras dobles");
	}

	@Test
	void testNumeroVocales() {

		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("coche"); 
		
		// 2 Expected
		int expected = 2;
		
		// 3 Actual
		int actual = cadenaATestear.numeroVocales();
		
		// 4 Asserts
		assertEquals(expected, actual, "El numero de vocales no esta bien calculado en la palabra coche");
		
	}
	
	@Test
	void testNumeroVocalesSinVocales() {

		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("cchs"); 
		
		// 2 Expected
		int expected = 0;
		
		// 3 Actual
		int actual = cadenaATestear.numeroVocales();
		
		// 4 Asserts
		assertEquals(expected, actual, "El numero de vocales no esta bien calculado en la palabra sin vocales");
		
	}
	
	@Test
	void testNumeroVocalesAcentuadasYMayusculas() {

		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("aáAÁeéEÉiíIÍoóOÓuúUÚ"); 
		
		// 2 Expected
		int expected = 20;
		
		// 3 Actual
		int actual = cadenaATestear.numeroVocales();
		
		// 4 Asserts
		assertEquals(expected, actual, "El numero de vocales no esta bien calculado en la palabra aáAÁeéEÉiíIÍoóOÓuúUÚ");
		
	}

	@Test
	void testInvertir() {
		
		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("goyena"); 
		
		// 2 Expected
		Cadena expected = new Cadena("aneyog");
		
		// 3 Actual
		cadenaATestear.invertir();
		
		// 4 Asserts
		assertEquals(expected, cadenaATestear, "No he conseguido invertir la  palabra goyena");
	}
	
	@Test
	void testInvertirVacio() {
		
		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena(""); 
		
		// 2 Expected
		Cadena expected = new Cadena("");
		
		// 3 Actual
		cadenaATestear.invertir();
		
		// 4 Asserts
		assertEquals(expected, cadenaATestear, "No he conseguido invertir la  palabra vacia");
	}

	@Test
	void testContarLetraQueExiste() {
		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("aáAÁeéEÉiíIÍoóOÓuúUÚ"); 
		char caracterAContar = 'a';
		
		// 2 Expected
		int expected = 1;
		
		// 3 Actual
		int actual = cadenaATestear.contarLetra(caracterAContar);
		
		// 4 Asserts
		assertEquals(expected, actual, "El numero de letras a no esta bien calculado en la palabra aáAÁeéEÉiíIÍoóOÓuúUÚ");
	}
	
	@Test
	void testContarLetraQueNoExiste() {
		// 1 Creo mi cadena
		Cadena cadenaATestear = new Cadena("aáAÁeéEÉiíIÍoóOÓuúUÚ"); 
		char caracterAContar = 'b';
		
		// 2 Expected
		int expected = 0;
		
		// 3 Actual
		int actual = cadenaATestear.contarLetra(caracterAContar);
		
		// 4 Asserts
		assertEquals(expected, actual, "El numero de letras b no esta bien calculado en la palabra aáAÁeéEÉiíIÍoóOÓuúUÚ");
	}

}
