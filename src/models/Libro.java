package models;

public class Libro {
	private String titulo, editorial, tipo;
	private int anio;
	private Autor autor;
	
	public Libro(String titulo, String editorial, String tipo, int anio, Autor autor) {
		super();
		this.titulo = titulo;
		this.editorial = editorial;
		this.tipo = tipo;
		this.anio = anio;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
}
