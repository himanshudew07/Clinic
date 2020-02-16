package org.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import java.util.List;



@Entity(name="DOCTER")
public class Doctor {
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Transient
	@JoinColumn(name="Vno")
	@OneToOne
	private Vehicle vehicle;
	
	
//	@JoinTable(name="RELATION", joinColumns = @JoinColumn(name="DOCTOR_ID"), inverseJoinColumns = @JoinColumn(name="VEHICLE_ID"))
	@OneToMany(mappedBy="doctor")
	private List<Vehicle> vehicles = new ArrayList<>();
	
	

	
	public Doctor(int id, String name, int age, Date dob) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	

	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
