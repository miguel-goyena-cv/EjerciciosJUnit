package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Clase para representar cadenas de caracteres, 
 * tiene diferentes funcionalidades para tratar el String que lleva dentro
 */
public class Cadena {
	
	private String miCadena;
	
	// Letras dobles
	private final static String DOBLE_LETRA_CH =  "CH";
	private final static String DOBLE_LETRA_ch =  "ch";
	private final static String DOBLE_LETRA_LL =  "LL";
	private final static String DOBLE_LETRA_ll =  "ll";
	
	//Vocales
	List<Character> lista = new ArrayList<>(Arrays.asList('a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'u', 'ú'));

	public Cadena(String miCadena) {
		super();
		this.miCadena = miCadena;
	}
	
	/**
	 * Devuelve la longitud de la cadena.
	 * @return
	 */
	public int longitud() {
		
		// Existen letras en castellano que son doble. CH, LL, Hay que saber identificarlas.
		if (miCadena.indexOf("ch") != 1 || miCadena.indexOf("ll") != 1) {

			// Quito las letras dobles
			// TODO puedo hacer algo para que esto no sea tan largo, juntar en una lista o pasar todo a minusculas,, etc
			String cadenaSinLetrasDobles = miCadena.replaceAll(DOBLE_LETRA_CH, "c");
			cadenaSinLetrasDobles = cadenaSinLetrasDobles.replaceAll(DOBLE_LETRA_ch, "c");
			cadenaSinLetrasDobles = cadenaSinLetrasDobles.replaceAll(DOBLE_LETRA_LL, "l");
			cadenaSinLetrasDobles = cadenaSinLetrasDobles.replaceAll(DOBLE_LETRA_ll, "l");
			
			return cadenaSinLetrasDobles.length();
			
		}
		
		// Cuando no hay esas excepciones utilizo el método de String
		return miCadena.length();
	}
	
	/**
	 * Devuelve las vocales de la cadena.
	 * Habrá que definir que es una vocal
	 * @return
	 */
	public int numeroVocales() {
		
		int numeroVocales = 0;
		
		// Paso la cadena a minusculas y asi me evito tener que definir caracteres repetidos
		for (Character letra: miCadena.toLowerCase().toCharArray()) {
			if (lista.contains(Character.valueOf(letra)))
				numeroVocales++;
		}
		
		return numeroVocales;
	}
	
	/**
	 * Invierte las letras de la palabra
	 */
	public void invertir() {
		
		String cadenaInvertida = "";
		
		// Voy invirtiendo caracter a caracter
		for (int i = miCadena.length()-1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + miCadena.charAt(i);
		}
		
		miCadena = cadenaInvertida;
		
	}
	
	
	/**
	 * Cuenta el número de caracteres que hay en la cadena
	 * Tiene que ser caracter exacto
	 * @param caracter el caracter a buscar
	 * @return
	 */
	public int contarLetra(char caracter) {
		
		int contador = 0;
		
		// Cuanto caracter a caracter, de forma exacta
		for (Character letra: miCadena.toCharArray()) {
			if (letra.equals(caracter))
				contador++;
		}
		
		return contador;
		
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadena other = (Cadena) obj;
		return Objects.equals(miCadena, other.miCadena);
	}
	
	

}
