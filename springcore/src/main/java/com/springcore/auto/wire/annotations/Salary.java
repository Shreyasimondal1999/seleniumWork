package com.springcore.auto.wire.annotations;

public class Salary {
private int Toatalsalary;
private int pfAmount;
public int getToatalsalary() {
	return Toatalsalary;
}
public void setToatalsalary(int toatalsalary) {
	Toatalsalary = toatalsalary;
}
public int getPfAmount() {
	return pfAmount;
}
public void setPfAmount(int pfAmount) {
	this.pfAmount = pfAmount;
}
public Salary(int toatalsalary, int pfAmount) {
	super();
	Toatalsalary = toatalsalary;
	this.pfAmount = pfAmount;
}
public Salary() {
	super();
	// TODO Auto-generated constructor stub
}

}
