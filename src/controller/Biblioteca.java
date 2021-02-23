package controller;
import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Autor;
import models.Copia;
import models.Lector;
import persistencia.AutorDAO;
import servicios.AutorService;

public class Biblioteca {

	public static void main(String[] args) throws Exception{
		Autor a = new Autor();
		a.setNombre("Mark");
		a.setNacimiento("1998");
		a.setNacionalidad("Argentina");
		AutorDAO autor = new AutorDAO();
		autor.agregarAutor(a);
		
		
		
		/*Scanner sc = new Scanner(System.in);
		MenuOpc opciones = new MenuOpc();
		String opc;
		
		Lector lector = new Lector();
		lector = opciones.identificarse();
		
		ArrayList<Copia> copias = new ArrayList<Copia>();
		copias.add(new Copia("Juego de tronos", "Bantam Books", "Novela", 1996, new Autor("George R. R. Martin", "Estados Unidos", "20 de septiembre de 1948"), 1, 0, 5));
		copias.add(new Copia("Choque de reyes", "Gigamesh", "Novela", 1998, new Autor("George R. R. Martin", "Estados Unidos", "20 de septiembre de 1948"), 2, 0, 5));
		copias.add(new Copia("Tormenta de espadas", "Bantam Spectra", "Novela", 2000, new Autor("George R. R. Martin", "Estados Unidos", "20 de septiembre de 1948"), 3, 0, 5));
		copias.add(new Copia("Festín de cuervos ", "HarperCollins", "Novela", 2005, new Autor("George R. R. Martin", "Estados Unidos", "20 de septiembre de 1948"), 4, 0, 5));
		copias.add(new Copia("Danza de dragones", "Bantam Books", "Novela", 2011, new Autor("George R. R. Martin", "Estados Unidos", "20 de septiembre de 1948"), 5, 0, 5));
		copias.add(new Copia("Harry Potter y la piedra filosofal", "Bloomsbury Publishing", "Novela", 1997, new Autor("J. K. Rowling", "Reino Unido", "31 de julio de 1965"), 6, 0, 5));
		copias.add(new Copia("Harry Potter y la cámara secreta", "Bloomsbury Publishing", "Novela", 1998, new Autor("J. K. Rowling", "Reino Unido", "31 de julio de 1965"), 7, 0, 5));
		copias.add(new Copia("Harry Potter y el prisionero de Azkaban", "Bloomsbury Publishing", "Novela", 1999, new Autor("J. K. Rowling", "Reino Unido", "31 de julio de 1965"), 8, 0, 5));
		copias.add(new Copia("Harry Potter y el cáliz de fuego", "Bloomsbury Publishing", "Novela", 2000, new Autor("J. K. Rowling", "Reino Unido", "31 de julio de 1965"), 9, 0, 5));
		copias.add(new Copia("Harry Potter y la Orden del Fénix", "Bloomsbury Publishing", "Novela", 2003, new Autor("J. K. Rowling", "Reino Unido", "31 de julio de 1965"), 10, 0, 5));
		
		
		do {
			do {
				System.out.println("1. Pedir libro. 2. Devolver libro. 3. Salir. Elegir una opción: ");
				opc = sc.next();
			}while(opciones.isNumeric(opc) == false);
		
		
		switch(opc) {
			case "1":
				opciones.dibujarStock(copias);
				ArrayList<Copia> nuevo_listado = new ArrayList<Copia>();
				nuevo_listado.addAll(lector.prestar(copias, lector));
				copias.clear();
				copias.addAll(nuevo_listado);
				break;
				
			case "2": 
				lector.devolver(lector);
				break;
			default:
				System.out.println("Opción inválida. Vuelva a intentarlo.");
				break;
		}
		
		}while(!(opc.equals("3")));*/
	}

}
