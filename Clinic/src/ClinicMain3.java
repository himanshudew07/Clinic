import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.FourWheeler;
import org.model.TwoWheeler;
import org.model.Vehicle;

public class ClinicMain3 {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleno(10001);
		vehicle.setType("Truck");
		vehicle.setName("TATA");
		
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setVehicleno(4929);
		twoWheeler.setType("Splender");
		twoWheeler.setName("Honda");
		twoWheeler.setSteringHandle("HandleType");
		
		

		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setVehicleno(9923);
		fourWheeler.setType("Car");
		fourWheeler.setName("Maruti");
		fourWheeler.setSteringwheel("WheelType");
		
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);
		
		session.getTransaction().commit();
		session.close();
		
	}
	
}
