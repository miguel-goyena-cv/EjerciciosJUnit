package org.cuatrovientos.dam.ed.EjerciciosJUnit.examen3VCorregidoOtro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FlotaVehiculos4VTest {

	@Test
	void testCochesParaAlquilarConPlazasIlegales() {
		
		// 1 Objetos a crear
		FlotaVehiculos4V fVehiculos = new FlotaVehiculos4V();
		
		//2 Ejecutar el metodo con plazas -1
		IllegalArgumentException actualException = null;
		try {
			fVehiculos.cochesQuePuedesAlquilar(-1);
		}
		catch (IllegalArgumentException e) {
			actualException = e;
			e.printStackTrace();
			System.err.println("Exception:" + e.getMessage());
		}
		
		//3 Verificar que lo actual es lo esperado
		assertNotNull(actualException);
		assertEquals("Plazas deben de ser > 0", actualException.getMessage());
	}
	
	@Test
	void testCochesParaAlquilarConPlazasYAlmacenVacio() {
		
		// 1 Objetos a crear
		FlotaVehiculos4V fVehiculos = new FlotaVehiculos4V();
		
		//2 Ejecutar el metodo con plazas -1
		int actual = fVehiculos.cochesQuePuedesAlquilar(2);
		
		//3 Verificar que lo actual es lo esperado
		int expected = 0;
		assertEquals(actual, expected);
	}
	
	@Test
	void testCochesParaAlquilarConPlazas() {
		
		// 1 Objetos a crear
		FlotaVehiculos4V fVehiculos = creaerFlotaVehiculosCoches();
		
		//2 Ejecutar el metodo con plazas -1
		int actual = fVehiculos.cochesQuePuedesAlquilar(2);
		
		//3 Verificar que lo actual es lo esperado
		int expected = 1;
		assertEquals(actual, expected);
	}


	
	@Test
	void testCochesParaAlquilarYMeDaIgualLasPlazas() {
		
		FlotaVehiculos4V fVehiculos = creaerFlotaVehiculosCoches();
		
		//2 Ejecutar el metodo con plazas -1
		int actual = fVehiculos.cochesQuePuedesAlquilar(0);
		
		//3 Verificar que lo actual es lo esperado
		int expected = 1;
		assertEquals(actual, expected);
	}
	
	
	@Test
	void testCochesParaAlquilarConPlazasMayoresQueLasDeLaFlota() {
		
		FlotaVehiculos4V fVehiculos = creaerFlotaVehiculosCoches();
		
		//2 Ejecutar el metodo con plazas -1
		int actual = fVehiculos.cochesQuePuedesAlquilar(18);
		
		//3 Verificar que lo actual es lo esperado
		int expected = 0;
		assertEquals(actual, expected);
	}
	
	
	
	
	
	
	
	@Test
	void testMarcasDeMotosAAlquilar() {
		
		FlotaVehiculos4V nuevaFlota = generarFlotaTestParaMotos();
		
		// Expected and Actual
		List<String> expected = new ArrayList<>(Arrays.asList("SUZUKI"));
		List<String> actual = nuevaFlota.marcasDeMotosAAlquilar("suzuki");
		
		// Asserts
		assertEquals(expected, actual);
	}
	
	@Test
	void testMarcasDeMotosAAlquilarMarcaNula() {
		
		FlotaVehiculos4V nuevaFlota = generarFlotaTestParaMotos();
		
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
	private FlotaVehiculos4V generarFlotaTestParaMotos() {
		FlotaVehiculos4V nuevaFlota = new FlotaVehiculos4V();
		Vehiculo moto1 = new Vehiculo(TipoVehiculo.MOTO, MarcaVehiculo.HONDA, "AABB", 2);
		Vehiculo moto2 = new Vehiculo(TipoVehiculo.MOTO, MarcaVehiculo.SUZUKI, "AABB", 2);
		Vehiculo moto3 = new Vehiculo(TipoVehiculo.MOTO, MarcaVehiculo.SUZUKI, "AABB", 2);
		Vehiculo moto4 = new Vehiculo(TipoVehiculo.MOTO, MarcaVehiculo.HONDA, "JJJJ", 2);
		moto4.alquilarVehiculo();
		nuevaFlota.introducirEnAlmacen(moto1);
		nuevaFlota.introducirEnAlmacen(moto2);
		nuevaFlota.introducirEnAlmacen(moto3);
		nuevaFlota.introducirEnAlmacen(moto4);
		Vehiculo coche1 = new Vehiculo(TipoVehiculo.COCHE, MarcaVehiculo.HONDA, "JJRR", 4);
		nuevaFlota.introducirEnAlmacen(coche1);
		return nuevaFlota;
	}
	
	
	/**
	 * Creamos una flota de test para probar los metodos de cochesQuePuedesAlquilar
	 * @return
	 */
	private FlotaVehiculos4V creaerFlotaVehiculosCoches() {
		FlotaVehiculos4V fVehiculos = new FlotaVehiculos4V();
		Vehiculo coche1 = new Vehiculo(TipoVehiculo.COCHE, MarcaVehiculo.RENAULT, "AAABB", 6);
		fVehiculos.introducirEnAlmacen(coche1);
		Vehiculo coche2 = new Vehiculo(TipoVehiculo.COCHE, MarcaVehiculo.MERCEDES, "JJJ", 2); // Para cubrir coches ya alquilados
		coche2.alquilarVehiculo();
		fVehiculos.introducirEnAlmacen(coche2);
		Vehiculo moto1 = new Vehiculo(TipoVehiculo.MOTO, MarcaVehiculo.HONDA, "FFGG", 2);
		fVehiculos.introducirEnAlmacen(moto1);
		return fVehiculos;
	}
}
