package models;
import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)  
@Table(name="Autores")
public class Autor implements Serializable{

	private static final long serialVersionUID = -1461119577503049112L;
	@Id
	private String nombre;
	@Column
	private String nacionalidad;
	@Column
	private String nacimiento;
	

	
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


