package org.cuatrovientos.dam.ed.EjerciciosJUnit.examen3VCorregido;

import java.util.ArrayList;
import java.util.List;

public class FlotaVehiculos4V {

	private List<Vehiculo> vehiculosAlquiler;

	/**
	 * Constructor que inicializa la lista de Vehiculos
	 */
	public FlotaVehiculos4V() {
		this.vehiculosAlquiler = new ArrayList<Vehiculo>();
	}
	
	
	/**
	 * Anade un vehiculo a la BBDD de vehiculos.
	 * @param vehiculo
	 */
	public void anadirVehiculo(Vehiculo vehiculo) {
		this.vehiculosAlquiler.add(vehiculo);
	}
	
	
	/**
	 * Te da el número de COCHES que puedes alquilar.
	 * Que cumple que las plazas sean >= a las plazas pedidas.
	 * Además los coches deben de estar libres.
	 * @param plazas El número de plazas mínimo que necesito para un coche. Si plaza es 0 no me importa el número de plazas.
	 * @return El número de coches disponibles.
	 * @throws IllegalArgumentException Si el número de plazas es < 0
	 */
	public int cochesQuePuedesAlquilar(int plazas) throws IllegalArgumentException{
		
		// Si las plazas son menores que 0 entonces devuelvo Exception
		if (plazas < 0) {
			throw new IllegalArgumentException("Plazas deben de ser > 0");
		}
		
		int cochesDisponibles = 0;
		
		// Iteramos sobre la lista de vehiculos completos cumpliendo las especificaciones.
		for (Vehiculo vehiculo: this.vehiculosAlquiler) {
			
			// Miramos si es un coche
			boolean esCoche = (vehiculo.getTipo() == TipoVehiculo.COCHE);
			
			// Miramos si esta libre
			boolean estaLibre = !vehiculo.isAlquilado();
			
			// El numero de plazas debe de ser >= al del vehiculo
			// Si es 0 entonces cualquier vehiculo nos sirve
			boolean cumplePlazas = (plazas == 0 || vehiculo.getPlazas() >= plazas);
			
			//Evaluo la expresion
			if (esCoche && estaLibre && cumplePlazas) {
				cochesDisponibles++;
			}
		}
		
		return cochesDisponibles;
		
	}

	/**
	 * Muestra la lista de marcas de MOTOS que son posibles a alquilar, o sea que no estén alquiladas previamente.
	 * En está lista de marcas no puede haber marcas repetidas. Y las marcas puedes estar en mayúsculas o minúsculas.
	 * O sea es lo mismo Honda que HONDA.
	 * @param marca Marca de motos a buscar. Si marca es nulo entonces devolvemos todas las marcas que existan
	 * @return Una lista de marcas de motos. Las marcas en mayúsculas. Si no hay motos disponibles devolvemos una lista vacía.
	 */
	public List<String> marcasDeMotosAAlquilar(String marca){

		List<String> listaMarcas = new ArrayList<>();
		
		// Iteramos sobre la lista de vehiculos para buscar Marcas de motos
		// El proposito es sólo iterar una vez sobre la lista
		for (Vehiculo vehiculo: this.vehiculosAlquiler) {
			
			// Miramos si es un coche
			boolean esMoto = (vehiculo.getTipo() == TipoVehiculo.MOTO);
			
			// Miramos si esta libre
			boolean estaLibre = !vehiculo.isAlquilado();
			
			// Miramos si es de la marca que queremos, teniendo en cuenta que puede ser nula la marca
			boolean esMarca = (marca == null || marca.toUpperCase().equals(vehiculo.getMarca().toUpperCase()));

			// Si cumplimos todas las especificaciones entonces tendremos que mirar si no estaba ya repetido.
			if (esMoto && estaLibre && esMarca) {
				
				// Miramos si no esta repetido, OJO con las mayusculas y minusculas
				// TODO se podría hacer con un contains de la interfaz List
				boolean estaRepetido = false;
				for (String marcaActual: listaMarcas) {
					if (marcaActual.equals(vehiculo.getMarca().toUpperCase())) {
						estaRepetido = true;
						break;
					}
				}
				// YUJU!!: Nueva marca
				if (!estaRepetido) {
					listaMarcas.add(vehiculo.getMarca().toUpperCase()); // Metemos las marcas en Mayusculas
				}	
			}
		}
		
		return listaMarcas;
		
	}

}
