package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicioTipoExamen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AlumnoTest {

    private Alumno alumno;

    @BeforeEach
    public void setUp() {
        alumno = new Alumno("Pablo Higuero", "pablo.higuero@ejemplo.com");
    }

    @Test
    public void testAlumnoAprobadoSinModulos() throws Exception {
    	//Si no se introducen datos pasa esto
        assertTrue(alumno.estaAlumnoAprobado(),"El alumno no esta inscrito en ningun módulo, se le apruba automáticamente");
    }
    
    @Test
    public void testEmailInValido() {
        alumno.setEmail("emailinvalido");
        Exception exceptionActual = new Exception();
        try {
        	alumno.estaAlumnoAprobado();
			
		} catch (Exception e) {
			exceptionActual = e;
		}
        assertEquals(exceptionActual.getMessage(), "Email invalido", "Email no valido");
    }

    @Test
    public void testEmailNulo() {
        alumno.setEmail(null);
        
        Exception exception = assertThrows(Exception.class, () -> {
        	alumno.estaAlumnoAprobado();
        });
        
        assertEquals(exception.getMessage(), "Email invalido", "Email no valido");
    }

    @Test
    public void testAlumnoNoAprobado() throws Exception {
    	
        Modulo modulo = new Modulo("Entornos Desarrollo");
        modulo.anadirEntregable(new Valoracion("Entregable1", 5));
        modulo.anadirEntregable(new Valoracion("Entregable2", 4));
        modulo.anadirEntregable(new Valoracion("Entregable3", 6));
        modulo.anadirExamen(new Valoracion("Examen1", 3)); // suspende por sacar menos de un 4 aquí
        modulo.anadirExamen(new Valoracion("Examen2", 5));

        alumno.anadirModulo(modulo);

        assertFalse(alumno.estaAlumnoAprobado(),"El alumno no ha aprobado");
    }

    @Test
    public void testAlumnoAprobado() throws Exception {
    	
        Modulo modulo = new Modulo("Entornos Desarrollo");
        modulo.anadirEntregable(new Valoracion("Entregable 1", 5));
        modulo.anadirEntregable(new Valoracion("Entregable 2", 6));
        modulo.anadirEntregable(new Valoracion("Entregable 3", 7));
        modulo.anadirExamen(new Valoracion("Examen1", 5));
        modulo.anadirExamen(new Valoracion("Examen2", 6));
        
        alumno.anadirModulo(modulo);
        
        assertTrue(alumno.estaAlumnoAprobado(),"El alumno ha aprobado");
    }

}
