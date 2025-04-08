/**
 * 
 */
package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosclase;

import static org.junit.jupiter.api.Assertions.*;

import org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosclase.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 * 
 */
public class CalculatorTest {
	
	Calculator calculadora = new Calculator();

	/**
	 * Test method for {@link org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosclase.Calculator#multiply(double, double)}.
	 */
	@Test
	void testMultiply() {
		
		// 1 Me creo lo necesario
		Calculator calculadora = new Calculator();
		
		// 2 expected
		double expected = 4;
		
		// 3 Ejecuto
		double actual = calculadora.multiply(2, 2);
		
		// 4 Asserts
		assertEquals(expected, actual, "No multiplica bien 2 por 2");
		
		// 2 expected
		expected = 0;
		
		// 3 Ejecuto
		actual = calculadora.multiply(2, 0);
		
		// 4 Asserts
		assertEquals(expected, actual, "No multiplica bien por 0");
		
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosclase.Calculator#divide(double, double)}.
	 */
	@Test
	void testDivide() {
		// 1 Me creo lo necesario
		Calculator calculadora = new Calculator();
		
		// 2 expected
		double expected = 1;
		
		// 3 Ejecuto
		double actual = calculadora.divide(2, 2);
		
		// 4 Asserts
		assertEquals(expected, actual, "No divide bien 2/2");
		
	}
	
	@RepeatedTest(5)
	void testDivideRepeated() {
		
		// 2 expected
		double expected = 1;
		
		// 3 Ejecuto
		double actual = calculadora.divide(2, 2);
		
		// 4 Asserts
		assertEquals(expected, actual, "No divide bien 2/2");
		
	}

}
