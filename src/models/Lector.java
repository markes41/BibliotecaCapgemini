package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Scanner;

import controller.MenuOpc;

public class Lector {
	private int nSocio, telefono, multa_dias = 0, cantidad_libros = 0;
	private String nombre, direccion;
	private HashMap<Integer, Copia> libros_prestados = new HashMap<Integer, Copia>();
	
	public int getnSocio() {
		return nSocio;
	}
	public void setnSocio(int nSocio) {
		this.nSocio = nSocio;
	}
	
	public int getCantidad_libros() {
		return cantidad_libros;
	}
	public void setCantidad_libros(int cantidad_libros) {
		this.cantidad_libros = cantidad_libros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public int getMulta_dias() {
		return multa_dias;
	}
	public void setMulta_dias(int multa_dias) {
		this.multa_dias = multa_dias;
	}
	public void devolver(Lector lector)
	{
		Scanner sc = new Scanner(System.in);
		int i = 1, opc;
		
		for(Copia libro : lector.libros_prestados.values()) {
			System.out.println("ID: "+libro.getId()+"\nTitulo del libro: "+libro.getTitulo()+"\n");
			i++;
		}
		
		System.out.println("Elegí el ID del libro que querés devolver: ");
		opc = sc.nextInt();
		
		lector.libros_prestados.remove(opc);
		
	}
	
	public ArrayList<Copia> prestar(ArrayList<Copia> libros_disponibles, Lector lector)
	{
		Scanner sc = new Scanner(System.in);
		int opc_libro;
		String dias_alquilar;
		MenuOpc opciones = new MenuOpc();
		
		System.out.println("Elegí el número del libro que querés: ");
		opc_libro = sc.nextInt();

		if(lector.libros_prestados.size() >= 3) {
			System.out.println("Actualmente tenés 3 libros en tu posesión. Devolvé al menos 1 para poder pedir otro.");
			
		}else if(lector.getMulta_dias() > 0) {
			System.out.println("Aún te quedan "+lector.getMulta_dias()+" días de multa. Una vez que termine ese tiempo vas a poder volver a pedir otro libro.");
		}else if(libros_disponibles.get(opc_libro).getCantidad() <= 0){
			System.out.println("Ya no quedan copias disponibles de '"+libros_disponibles.get(opc_libro).getTitulo()+"'. Intente con otro libro.");
		}else {
			do {
				do{
					System.out.println("¿Por cuántos dias desea alquilarlo? (Tiempo máximo 30 días): ");
					dias_alquilar = sc.next();
				}while(opciones.isNumeric(dias_alquilar) == false);
			}while(Integer.parseInt(dias_alquilar) < 0 || Integer.parseInt(dias_alquilar) > 30);
			
			GregorianCalendar fecha = new GregorianCalendar();
			Copia libro_elegido = libros_disponibles.get(opc_libro);
			libro_elegido.setFecha_dada(fecha);
			lector.libros_prestados.put(opc_libro+1, libro_elegido);
			
			

			System.out.println("Alquilaste el libro: "+libros_disponibles.get(opc_libro).getTitulo()+".\nFecha de adquisición: "+fecha.get(Calendar.DATE)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR));
			fecha.add(Calendar.DATE, Integer.parseInt(dias_alquilar));
			System.out.println("Fecha de devolución: "+fecha.get(Calendar.DATE)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR));
			libros_disponibles.get(opc_libro).setCantidad(libros_disponibles.get(opc_libro).getCantidad() - 1);
		}
		
		return libros_disponibles;
	}
	
	public void multar(int cantidad_dias, Lector lector_multado)
	{
		
	}

}
