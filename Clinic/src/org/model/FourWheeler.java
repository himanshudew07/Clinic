package org.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue( value="Car")
public class FourWheeler extends Vehicle {

	private String steringwheel;
	
	public String getSteringwheel() {
		return steringwheel;
	}

	public void setSteringwheel(String steringwheel) {
		this.steringwheel = steringwheel;
	}


}
