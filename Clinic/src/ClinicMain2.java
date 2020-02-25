import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.Doctor;
import org.model.Vehicle;

public class ClinicMain2 {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		System.out.println("Start");
		Vehicle vehicle  = (Vehicle) session.get(Vehicle.class,2902);
		Doctor doctor = vehicle.getDoctor();
		System.out.println("Stop");
		System.out.println(doctor);
		System.out.println(vehicle);
		session.close();
		
		
		
		
		
		
	}

}
