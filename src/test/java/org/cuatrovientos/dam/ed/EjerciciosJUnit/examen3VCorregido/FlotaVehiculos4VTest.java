package org.cuatrovientos.dam.ed.EjerciciosJUnit.examen3VCorregido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FlotaVehiculos4VTest {

	@Test
	void testCochesQuePuedesAlquilar() {
		
		FlotaVehiculos4V nuevaFlota = generarFlotaTest();
		
		// Expected and Actual
		int expected = 1;
		int actual = nuevaFlota.cochesQuePuedesAlquilar(5);
		
		// Asserts
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testCochesQuePuedesAlquilarConCualquierPlaza() {
		
		// Creamos la flota
		FlotaVehiculos4V nuevaFlota = generarFlotaTest();
		
		// Expected and Actual
		int expected = 2;
		int actual = nuevaFlota.cochesQuePuedesAlquilar(0);
		
		// Asserts
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testCochesQuePuedesAlquilarPlazasNegativas() {
		
		// Creamos la flota
		FlotaVehiculos4V nuevaFlota = generarFlotaTest();
		
		// Expected and Actual and Assert
		assertThrows(IllegalArgumentException.class, () -> {
			nuevaFlota.cochesQuePuedesAlquilar(-1);
        });
		
	}

	@Test
	void testMarcasDeMotosAAlquilar() {
		
		FlotaVehiculos4V nuevaFlota = generarFlotaTest();
		
		// Expected and Actual
		List<String> expected = new ArrayList<>(Arrays.asList("SUZUKI"));
		List<String> actual = nuevaFlota.marcasDeMotosAAlquilar("suzuki");
		
		// Asserts
		assertEquals(expected, actual);
	}
	
	@Test
	void testMarcasDeMotosAAlquilarMarcaNula() {
		
		FlotaVehiculos4V nuevaFlota = generarFlotaTest();
		
		// Expected and Actual
		List<String> expected = new ArrayList<>(Arrays.asList("HONDA", "SUZUKI"));
		List<String> actual = nuevaFlota.marcasDeMotosAAlquilar(null);
		
		// Asserts
		assertEquals(expected, actual);
	}

	
	/**
	 * Para Generar el test de la flota
	 * @return
	 */
	private FlotaVehiculos4V generarFlotaTest() {
		FlotaVehiculos4V nuevaFlota = new FlotaVehiculos4V();
		Vehiculo moto1 = new Vehiculo(TipoVehiculo.MOTO, "Honda", "AABB", 2);
		Vehiculo moto2 = new Vehiculo(TipoVehiculo.MOTO, "SUZUKI", "AABB", 2);
		Vehiculo moto3 = new Vehiculo(TipoVehiculo.MOTO, "Suzuki", "AABB", 2);
		Vehiculo moto4 = new Vehiculo(TipoVehiculo.MOTO, "Honda", "JJJJ", 2);
		moto4.alquilarVehiculo();
		nuevaFlota.anadirVehiculo(moto1);
		nuevaFlota.anadirVehiculo(moto2);
		nuevaFlota.anadirVehiculo(moto3);
		nuevaFlota.anadirVehiculo(moto4);
		Vehiculo coche1 = new Vehiculo(TipoVehiculo.COCHE, "Honda", "JJRR", 4);
		Vehiculo coche2 = new Vehiculo(TipoVehiculo.COCHE, "Renault", "JJRRE", 5);
		Vehiculo coche3 = new Vehiculo(TipoVehiculo.COCHE, "Renault", "AACC", 5);
		coche3.alquilarVehiculo();
		nuevaFlota.anadirVehiculo(coche1);
		nuevaFlota.anadirVehiculo(coche2);
		nuevaFlota.anadirVehiculo(coche3);
		return nuevaFlota;
	}
}
