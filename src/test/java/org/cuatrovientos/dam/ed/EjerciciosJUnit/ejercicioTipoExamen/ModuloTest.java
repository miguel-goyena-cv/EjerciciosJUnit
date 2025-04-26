package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicioTipoExamen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ModuloTest {

	private Modulo modulo;

	@BeforeEach
	public void setUp() {
		modulo = new Modulo("Entornos Desarrollo");
	}

	@Test
	public void testCalcularNotaSinEntregablesSuficientes() {

		float notaEsperada = 0;

		modulo.anadirEntregable(new Valoracion("Entregable 1", 5));
		modulo.anadirExamen(new Valoracion("Examen 1", 5));
		modulo.anadirExamen(new Valoracion("Examen 2", 6));

		assertEquals(notaEsperada, modulo.calcularNota(), "No hay entregables suficientes");
	}

	@Test
	public void testCalcularNotaSinExamenesSuficientes() {

		float notaEsperada = 0;

		modulo.anadirEntregable(new Valoracion("Entregable 1", 5));
		modulo.anadirEntregable(new Valoracion("Entregable 2", 6));
		modulo.anadirEntregable(new Valoracion("Entregable 3", 7));
		modulo.anadirExamen(new Valoracion("Examen 1", 5));

		assertEquals(notaEsperada, modulo.calcularNota(), "No hay examenes suficientes");
	}

	@Test
	public void testCalcularNotaConExamenesNotaInferiorA4() {

		float notaEsperada = 3;

		modulo.anadirEntregable(new Valoracion("Entregable 1", 5));
		modulo.anadirEntregable(new Valoracion("Entregable 2", 6));
		modulo.anadirEntregable(new Valoracion("Entregable 3", 7));
		modulo.anadirExamen(new Valoracion("Examen 1", 3));
		modulo.anadirExamen(new Valoracion("Examen 2", 5));
		assertEquals(notaEsperada, modulo.calcularNota(), "Nota inferior a 4 en examen");
	}

	@Test
	public void testCalcularNotaConNotasValidas() {

		float notaEsperada = 5;

		modulo.anadirEntregable(new Valoracion("Entregable 1", 5));
		modulo.anadirEntregable(new Valoracion("Entregable 2", 5));
		modulo.anadirEntregable(new Valoracion("Entregable 3", 5));
		modulo.anadirExamen(new Valoracion("Examen 1", 5));
		modulo.anadirExamen(new Valoracion("Examen 2", 5));
		assertEquals(notaEsperada, modulo.calcularNota(), 0.1, "Aprobado");
	}
}
