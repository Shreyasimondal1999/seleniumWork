package com.springcore.auto.wire;

public class Address {
private String street;
private int Zipcode;
private String city;

public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getZipcode() {
	return Zipcode;
}
public void setZipcode(int zipcode) {
	Zipcode = zipcode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String street, int zipcode, String city) {
	super();
	this.street = street;
	Zipcode = zipcode;
	this.city = city;
}
public String toString() {
	return this.street + " " + this.city +" " + this.Zipcode;
}

}
