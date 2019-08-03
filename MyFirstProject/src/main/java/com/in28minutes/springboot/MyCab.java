package com.in28minutes.springboot;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyCab {

	@Id
	private String name;
	private String phone;
	private String email;
	private String taxitype;
	private String extras;
	private String pickupDateAndTime;
	private String pickupPlace;
	private String dropPlace;
	private String specialInstructions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTaxitype() {
		return taxitype;
	}
	public void setTaxitype(String taxitype) {
		this.taxitype = taxitype;
	}
	public String getExtras() {
		return extras;
	}
	public void setExtras(String extras) {
		this.extras = extras;
	}
	public String getPickupDateAndTime() {
		return pickupDateAndTime;
	}
	public void setPickupDateAndTime(String pickupDateAndTime) {
		this.pickupDateAndTime = pickupDateAndTime;
	}
	public String getPickupPlace() {
		return pickupPlace;
	}
	public void setPickupPlace(String pickupPlace) {
		this.pickupPlace = pickupPlace;
	}
	public String getDropPlace() {
		return dropPlace;
	}
	public void setDropPlace(String dropPlace) {
		this.dropPlace = dropPlace;
	}
	public String getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	
	@Override
	public String toString() {
		return "MyCab [name=" + name + ", phone=" + phone + ", email=" + email + ", taxitype=" + taxitype + ", extras="
				+ extras + ", pickupDateAndTime=" + pickupDateAndTime + ", pickupPlace=" + pickupPlace + ", dropPlace="
				+ dropPlace + ", specialInstructions=" + specialInstructions + "]";
	}

}
