package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicio2;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

/**
 * 
 */
class GeneradorIpTest {

	GeneradorIp generadorIp;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		generadorIp = new GeneradorIp();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej12.GeneradorIp#generarNumero(int, int)}.
	 */
	@RepeatedTest(4000)
	void testGenerarNumero() {
		
		// Expected
		int minNumeroResultado = 0;
		int maxNumeroResultado = 254;
		
		//Actual
		int actual = generadorIp.generarNumero(0, 254);
		
		//Assert
		boolean condicionExito = (actual >= minNumeroResultado && actual <=maxNumeroResultado);
		assertTrue(condicionExito,"El numero no está entre los valores min y max");
		
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam1.ed.ejerciciosjunit.ej12.GeneradorIp#generarIp()}.
	 */
	@RepeatedTest(4000)
	void testGenerarIp() {


		//Expected
		String startValuesForbiden = "0";
		String endValuesForbidden = ".0";
		
		
		// Actual
		String actual = generadorIp.generarIp();
		
		// Asserts
		String[] componentes = actual.split("\\.");
		assertFalse(componentes[0].equals(startValuesForbiden),"IP que empieza por 0");
		assertFalse(actual.endsWith(endValuesForbidden),"IP que acaba por 0");
		
	}

}
