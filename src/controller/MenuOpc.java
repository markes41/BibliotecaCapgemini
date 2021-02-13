package controller;

import java.util.ArrayList;
import java.util.Scanner;

import models.Copia;
import models.Lector;

public class MenuOpc {
	
	public Lector identificarse() {
		Scanner sc = new Scanner(System.in);
		
		Lector lector = new Lector();
		System.out.println("Bienvenido a la biblioteca, identif�quese: ");
		
		System.out.println("N�mero de socio: ");
		lector.setnSocio(sc.nextInt());
		
		System.out.println("Nombre: ");
		lector.setNombre(sc.next());
		
		System.out.println("N�mero de tel�fono: ");
		lector.setTelefono(sc.nextInt());
		
		System.out.println("Direcci�n: ");
		lector.setDireccion(sc.next());
		
		System.out.println("Gracias por brindarnos sus datos "+lector.getNombre()+". A continuaci�n le aparecer� un men� con opciones.");
		
		return lector;
	}
	
	public void dibujarStock(ArrayList<Copia> lista_libros) {
		System.out.println("Tenemos en stock los siguientes libros. Cada cliente tiene un m�ximo total permitido de 3 libros.\n");
		int i = 1;
		for (Copia libros_disponibles : lista_libros) {
			System.out.println("\n///////////////Libro #"+i+"///////////////\n");
			System.out.println(
				"Nombre: "+libros_disponibles.getTitulo()+
				"\nEditorial: "+libros_disponibles.getEditorial()+
				"\nA�o de publicaci�n: "+libros_disponibles.getAnio()+
				"\nAutor: "+libros_disponibles.getAutor().getNombre()+
				"\nCopias disponibles: "+libros_disponibles.getCantidad());
			i++;
		}
	}
	
	public boolean isNumeric(String num) {
		try {
			Integer.parseInt(num);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
}
