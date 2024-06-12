package com.springcore.auto.wire;

public class Employee {
private Address ad;

public Address getAd() {
	return ad;
}
public void setAd(Address ad) {
	this.ad = ad;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Address ad) {
	super();
	this.ad = ad;
}
@Override
public String toString() {
	return "Employee [ad=" + ad + "]";
}

}
