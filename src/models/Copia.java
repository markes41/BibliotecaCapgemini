package models;

import java.util.GregorianCalendar;

public class Copia extends Libro{
	private int id, status, cantidad;
	private GregorianCalendar fecha_dada;

	public Copia(String titulo, String editorial, String tipo, int anio, Autor autor, int id, int status,
			int cantidad) {
		super(titulo, editorial, tipo, anio, autor);
		this.id = id;
		this.status = status;
		this.cantidad = cantidad;
	}

	public GregorianCalendar getFecha_dada() {
		return fecha_dada;
	}


	public void setFecha_dada(GregorianCalendar fecha_dada) {
		this.fecha_dada = fecha_dada;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
	
}
