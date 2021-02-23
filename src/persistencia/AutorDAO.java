package persistencia;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;

import models.Autor;

public class AutorDAO implements Serializable{

	private static final long serialVersionUID = -6810525660725397365L;
	private static EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ejsHibernate");
	
	public void agregarAutor(Autor a) throws Exception {
		EntityManager em = managerFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		em.persist(a);
		tran.commit();
		em.close();
	}
	
	public void consultarAutores() throws Exception{
		EntityManager em = managerFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		
		ArrayList<Autor> autores = (ArrayList<Autor>) em.createQuery("select a from Autor a").getResultList();
		for(Autor a : autores) {
			System.out.println(a.getNombre());
		}
		tran.commit();
		em.close();
	}
}
