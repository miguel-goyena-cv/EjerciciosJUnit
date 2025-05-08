package org.cuatrovientos.dam.ed.EjerciciosJUnit.examen3VPrueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	/**
	 * Testear el metodo de ingresar dinero.
	 * Hay que testear en un único metodo todas las posibilidades del método (Vaya bien o vaya mal)
	 */
	@Test
	void testIngresar() {
		
		CuentaBancaria cuentaATestear = new CuentaBancaria("AAA");
		
		// Caso de prueba para ingresar valores positivos
		double expectedOK = 10;	
		cuentaATestear.ingresar(10);
		double actualOk = cuentaATestear.getSaldo();
		assertTrue(expectedOK == actualOk,"Test incorrecto para ingresos positivos");
		
		// Caso de prueba para ingresar valores negativos
		cuentaATestear = new CuentaBancaria("AAA"); // Reinicio la cuenta
		double expectedKO = 0;	
		cuentaATestear.ingresar(-10);
		double actualKO = cuentaATestear.getSaldo();
		assertTrue(expectedKO == actualKO,"Test incorrecto para ingresos negativos");
		
	}

}
