package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	void testProductoNormal() {
		
		try {
			// 1 Creo mi producto
			Producto productoATestear = new Producto("Coche", 12000.45f, 2); 
			
			// 2 Expected
			String expectedString = "Producto [nombre=Coche, precio=12000.45, cantidad=2]";
			float expectedTotal = 12000.45f * 2;
			
			// 3 Actual
			String actualString = productoATestear.toString();
			float actualTotal = productoATestear.precioTotal();
			
			// 4 Asserts
			assertEquals(actualString, expectedString, "El toString no representa como debe");
			assertEquals(expectedTotal, actualTotal, "Se calcula mal el precio de la factura");
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
			fail("Lanza una exception que no deberia");
		}

	}
	
	@Test
	void testProductoConNombresRaros() {

		
		// 3 y 4 Asserts Exception
        Exception exception = assertThrows(Exception.class, () -> {
    		// 1 Creo mi producto
    		Producto productoATestear = new Producto("Coché", 12000.45f, 2); 
        });

        // 4 Verifico también que el mensaje es el apropiado
        assertEquals("Nombre con caracteres diferentes a letras minusculas o mayusculas", exception.getMessage());
		

	}
	
	@Test
	void testProductoConPreciosImposibles() {

		
		// 3 y 4 Asserts Exception
        Exception exception = assertThrows(Exception.class, () -> {
    		// 1 Creo mi producto
    		Producto productoATestear = new Producto("Coche", -1, 2); 
        });

        // 4 Verifico también que el mensaje es el apropiado
        assertEquals("Precios mayores o igual a 0", exception.getMessage());
		

	}
	
	@Test
	void testProductoConCantidadesImposibles() {

		
		// 3 y 4 Asserts Exception
        Exception exception = assertThrows(Exception.class, () -> {
    		// 1 Creo mi producto
    		Producto productoATestear = new Producto("Coche", 10, 0); 
        });

        // 4 Verifico también que el mensaje es el apropiado
        assertEquals("Cantidades mayores a 0", exception.getMessage());
		

	}

}
