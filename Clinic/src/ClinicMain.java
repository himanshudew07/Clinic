import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.Doctor;
import org.model.Vehicle;

public class ClinicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("javax.xml.accessExternalDTD", "all");
		Doctor doctor1 = new Doctor(1001,"Ramesh shah", 54, getDate("12-JAN-89"));
		Doctor doctor2 = new Doctor(1002,"Arun Jain", 40, getDate("25-SEP-82"));
		
		Vehicle vehicle1 = new Vehicle(2901, "Maruti","CAR");
		Vehicle vehicle2 = new Vehicle(2902, "TATA","TRUCK");
		Vehicle vehicle3 = new Vehicle(2903, "HONDA","BYCK");
		
		//@One-to-many
	/*	doctor1.getVehicles().add(vehicle1);
		doctor1.getVehicles().add(vehicle2);
		doctor1.getVehicles().add(vehicle3);*/
		
		doctor2.getVehicles().add(vehicle1);
		doctor2.getVehicles().add(vehicle2);
		doctor2.getVehicles().add(vehicle3);
		
		//many to one
		vehicle1.setDoctor(doctor2);
		vehicle2.setDoctor(doctor2);
		vehicle3.setDoctor(doctor2);
		
		
		
		
		//DOCTER_VEHICLE-> DOCTOR_ID_ VEHICLE_ID
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		session.save(doctor1);
		session.save(doctor2);
		
		session.save(vehicle1);
		session.save(vehicle2);
		session.save(vehicle3);
		
		session.getTransaction().commit();		

	}
	
	
	public static Date getDate(String date) {
		
		try {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy");
		return simpleDateFormat.parse(date);
		}catch (Exception e) {
			return null;
		}
		
	}

}
