import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.Doctor;

public class HIbernateCRUDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		for (int i=0; i<15; i++) {
			
			Doctor doctor = new Doctor(i, "Doctor-"+i, 12+i, new Date());
			session.save(doctor);
			
		}
		
		session.getTransaction().commit();
		session.close();

	}

}
