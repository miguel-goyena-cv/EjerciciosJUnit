package org.cuatrovientos.dam1.ed.ejerciciosjunit.ej12;

import java.util.Random;

public class GeneradorIp {
	
	/**
	 * Genera un numero aleatorio entre min y max
	 * @param min
	 * @param max
	 * @return
	 */
	public int generarNumero(int min, int max) {
		Random aleatorio = new Random(System.currentTimeMillis());
		int resultado = aleatorio.nextInt(max)+min;
		return resultado;
	}
	
	/**
	 * Generamos una IP de forma aleatoria
	 * @return
	 */
	public String generarIp() {
		
		// Generamos los componentes de forma individual
		int primerNumero = this.generarNumero(1, 254); // No queremos que empiece por 0
		int segundoNumero = this.generarNumero(0, 254);
		int tercerNUmero = this.generarNumero(0, 254);
		int cuartoNUmero = this.generarNumero(1, 254); // No queremos que acabe por 0
		
		// Generamos la IP
		return primerNumero+"."+segundoNumero+"."+tercerNUmero+"."+cuartoNUmero;
	}

}
