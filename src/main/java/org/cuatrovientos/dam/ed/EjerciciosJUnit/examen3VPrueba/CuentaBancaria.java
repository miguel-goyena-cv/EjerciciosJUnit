package org.cuatrovientos.dam.ed.EjerciciosJUnit.examen3VPrueba;

/**
 * Implementación de una cuenta bancaria simple, con un numero y un saldo
 * @author 4V
 */
public class CuentaBancaria {
	
	private String numero;
	private double saldo;
	
	public CuentaBancaria(String numero) {
		super();
		this.numero = numero;
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Ingresa dinero en la cuenta
	 * @param dineroAIngresar el dinero a ingresar
	 * @return true si el dineroAIngresar >=0 sino devuelve un false 
	 */
	public boolean ingresar(double dineroAIngresar) {
		
		// En el caso que intenten ingresar un numero negativo, no hago nada.
		if (dineroAIngresar < 0) {
			return false;
		}
		
		// En todos los demas casos, se suma el saldo y se devuleve true
		this.saldo = this.saldo + dineroAIngresar;
		return true;	
		
	}

}
