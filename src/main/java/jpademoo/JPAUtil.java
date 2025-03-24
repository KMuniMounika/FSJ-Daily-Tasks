package jpademoo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class JPAUtil {
	
	private static final EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmployeePU"); //EMF can connect the database which you need to connect.EMF can connect the database which you need to connect. Here no need to remember all the methods. Just use persistance it will take care of all the DB interface methods.
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
		
	}
	public static void close() {
		emf.close();
	}
}
