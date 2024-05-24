/**
 * 
 */
package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej11;

/**
 * Clase que da utilidades sobre una cadena
 */
public class Cadena {

	/**
	 * Devuelve la longitud de la cadena que se le pasa.
	 * 
	 * @param cadena
	 * @return
	 * @throws Exception
	 */
	public int longitud(String cadena) throws Exception {

		// Control de nulos
		if (cadena == null) {
			throw new Exception("Cadena vacia");
		}

		return cadena.length();
	}

	/**
	 * Devuelve el número de vocales minúsculas que tiene la cadena
	 * 
	 * @param cadena
	 * @return
	 */
	public int vocales(String cadena) {
		// TODO
		return 0;
	}

	/**
	 * Devuelve la cadena en orden inverso
	 * 
	 * @param cadena
	 * @return
	 */
	public String invertir(String cadena) {

		if (cadena == null) {
			return cadena;
		}

		String reverseString = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {

			reverseString = reverseString + cadena.charAt(i);
		}
		return reverseString;
	}

	/**
	 * Cuenta el número de veces que aparece el carácter en la cadena
	 * 
	 * @param cadena
	 * @param caracter
	 * @return
	 */
	public int contarLetra(String cadena, char caracter) {
		// TODO
		return 0;
	}

}
