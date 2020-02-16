package org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




@Entity(name="VEHICLE")
public class Vehicle {
	
	@Id
	@Column(name="Vno")
	private int vehicleno;
	
	@Column(name="Vname")
	private String name;
	
	
	@Column(name="VType")
	private String type; 
	
	@ManyToOne
	private Doctor doctor;

	public Vehicle(int vehicleno, String name, String type) {
		super();
		this.vehicleno = vehicleno;
		this.name = name;
		this.type = type;
	}
	
	public int getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(int vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}
