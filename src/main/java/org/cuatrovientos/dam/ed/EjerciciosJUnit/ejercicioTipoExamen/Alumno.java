package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para modelar cada Alumno de DAM
 */
public class Alumno {

    private String nombre;
    private String email;
    private List<Modulo> modulosMatriculados = new ArrayList<Modulo>();

    public Alumno(String nombre, String email) {
        this.nombre = nombre;
        setEmail(email); // En el caso en que el email sea invalido entonces lo pongo a nulo.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            this.email = null;
        }
    }

    public List<Modulo> getModulosMatriculados() {
        return modulosMatriculados;
    }

    public void anadirModulo(Modulo modulo) {
        this.modulosMatriculados.add(modulo);
    }

    /**
     * Calcula si el alumno está aprobado.
     * @return
     * @throws Exception si el email no es válido
     */
    public boolean estaAlumnoAprobado() throws Exception {
    	
    	// Comparo el email
        if (getEmail() == null) {
            throw new Exception("Email invalido");
        }
        
        // Si no esta matriculado en ningun sitio entonces esta aprobado.
        if (modulosMatriculados.isEmpty()) {
            return true;
        }
        
        // Si tiene algun módulo suspendido, el alumno esta suspendido
        for (Modulo modulo : modulosMatriculados) {
            if (modulo.calcularNota() <= 5) {
                return false;
            }
        }
        
        //Esta aprobado!!
        return true;
    }
}
