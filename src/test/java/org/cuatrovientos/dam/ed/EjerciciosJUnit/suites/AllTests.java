package org.cuatrovientos.dam.ed.EjerciciosJUnit.suites;
import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite()
@SelectClasses({org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosclase.CalculatorTest.class, org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicio1.CadenaTest.class})
@DisplayName("Test mas importantes para nuestros ejemplos")
public class AllTests {

}
