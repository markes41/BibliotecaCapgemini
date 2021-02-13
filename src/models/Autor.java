package models;
import java.util.Calendar;

public class Autor {
	private String nombre, nacionalidad;
	private String nacimiento;
	
	public Autor(String nombre, String nacionalidad, String nacimiento) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.nacimiento = nacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	
}


