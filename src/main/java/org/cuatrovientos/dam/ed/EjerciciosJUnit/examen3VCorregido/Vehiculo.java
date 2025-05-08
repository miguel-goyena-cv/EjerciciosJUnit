package org.cuatrovientos.dam.ed.EjerciciosJUnit.examen3VCorregido;

public class Vehiculo{
	
	private TipoVehiculo tipo;
	private String marca;
	private String matricula;
	private int plazas;
	private boolean alquilado;
	
	public Vehiculo (TipoVehiculo tipo, String marca,String matricula, int plazas) {
		this.tipo=tipo;
		this.marca=marca;
		this.matricula=matricula;
		this.plazas=plazas;
		this.alquilado=false;
	}

	/*
	 * GETTERS y SETTERS
	 */
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}

	/**
	 * Para alquilar un vehiculo
	 */
	public void alquilarVehiculo() {
		this.alquilado = true;
	}
	
	/**
	 * Para liberar un vehiculo
	 */
	public void liberarVehiculo() {
		this.alquilado = false;
	}
	
}
