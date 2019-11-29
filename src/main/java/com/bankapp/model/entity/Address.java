package com.bankapp.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adress_table")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String addressLine1;
private String addressLine2;
private String streat;
private String city;
private int pin;
private String country;



public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public String getStreat() {
	return streat;
}
public void setStreat(String streat) {
	this.streat = streat;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Address(String addressLine1, String addressLine2, String streat, String city, int pin, String country) {
	super();
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
	this.streat = streat;
	this.city = city;
	this.pin = pin;
	this.country = country;
}
public Address() {
	super();
	
}
@Override
public String toString() {
	return "Address [id=" + id + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", streat="
			+ streat + ", city=" + city + ", pin=" + pin + ", country=" + country + "]";
}


}
