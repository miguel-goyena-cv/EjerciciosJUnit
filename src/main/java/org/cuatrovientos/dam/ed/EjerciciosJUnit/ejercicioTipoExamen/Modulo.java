package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para los módulos de DAM, donde pongo fijos el número de entregables y el número de examenes
 */
public class Modulo {

	private String nombre;
	private List<Valoracion> listaEntregables = new ArrayList<Valoracion>();
	private List<Valoracion> listaExamenes = new ArrayList<Valoracion>();

	private final static int NUMERO_TOTAL_ENTREGABLES = 3;
	private final static int NUMERO_TOTAL_EXAMENES = 2; 

	public Modulo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void anadirEntregable(Valoracion entregable) {
		this.listaEntregables.add(entregable);
	}

	public void anadirExamen(Valoracion examen) {
		this.listaExamenes.add(examen);
	}

	public List<Valoracion> getListaEntregables() {
		return listaEntregables;
	}

	public List<Valoracion> getListaExamenes() {
		return listaExamenes;
	}
	
	/**
	 * Calcula la nota del módulo
	 * @return
	 */
	public double calcularNota() {
		
		// Tiene que cunmplirse que están todos los entregables menos 1 y todos los examenes realizados
		// sino un 0
        if (listaEntregables == null || listaEntregables.size() < NUMERO_TOTAL_ENTREGABLES - 1 || listaExamenes.size() < NUMERO_TOTAL_EXAMENES) {
            return 0;
        }

        // Todos los examenes tienen que tener como mínimo 4.
        double maxNotaInferiorA4 = 0;
        for (Valoracion examen : listaExamenes) {
            if (examen.getNota() < 4) {
                maxNotaInferiorA4 = Math.max(maxNotaInferiorA4, examen.getNota());
            }
        }
        if (maxNotaInferiorA4 > 0) {
            return maxNotaInferiorA4;
        }

        // Calculo la nota de los entregables
        double sumaEntregables = 0;
        for (Valoracion entregable : listaEntregables) {
            sumaEntregables += entregable.getNota();
        }

        // Calculo la nota de los examenes
        double sumaExamenes = 0;
        for (Valoracion examen : listaExamenes) {
            sumaExamenes += examen.getNota();
        }

        // Calculo la nota final 0.6*entregables + 0.4*examenes
        return (sumaEntregables / listaEntregables.size()) * 0.6 + (sumaExamenes / listaExamenes.size()) * 0.4;
    }
}


