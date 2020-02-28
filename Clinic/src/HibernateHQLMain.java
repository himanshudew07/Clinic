import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.model.Doctor;



public class HibernateHQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery("select name from Doctor where id > :id");
		query.setInteger("id", 5);
		query.setFirstResult(2);
		query.setMaxResults(4);
		
		//List<Doctor> doctors = (List<Doctor>) query.list();
		List<String> doctors = (List<String>) query.list();
		
		session.getTransaction().commit();
		session.close();
		
		//doctors.forEach( x -> System.out.println(x.getId()+" "+x.getName()+" "+x.getId())); 
		doctors.forEach( x -> System.out.println(x)); 
		
		
		

	}

}
