package org.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;




@Entity(name="VEHICLE")
public class Vehicle {
	
	@Id
	@Column(name="Vno")
	private int vehicleno;
	
	@Column(name="Vname")
	private String name;
	
	
	@Column(name="VType")
	private String type; 
	
	//@ManyToMany(mappedBy="vehicles")
	@Transient
	@ManyToOne(cascade = CascadeType.PERSIST)
	@NotFound(action = NotFoundAction.IGNORE)
	private Doctor doctor;


	public Vehicle(int vehicleno, String name, String type) {
		super();
		this.vehicleno = vehicleno;
		this.name = name;
		this.type = type;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
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


	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getVehicleno()+","+getName()+","+getType();
	}



}
