package servicios;

import jakarta.jws.*;
import models.Autor;
import persistencia.AutorDAO;

@WebService(targetNamespace="urn://com.example.managerNS")
public class AutorService {
	
	@WebMethod
	public boolean AgregarAutor(@WebParam(name="lector")Autor a) {
		AutorDAO autor = new AutorDAO();
		
		try {
			autor.agregarAutor(a);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	@WebMethod
	public void ConssultarAutores() {
		AutorDAO autor = new AutorDAO();
		try {
			autor.consultarAutores();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
