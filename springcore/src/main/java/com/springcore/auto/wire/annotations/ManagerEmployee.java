package com.springcore.auto.wire.annotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class ManagerEmployee {

private Salary salaryDetails;

public Salary getSalaryDetails() {
	return salaryDetails;
}
@Autowired
@Qualifier("s2")
public void setSalaryDetails(Salary salaryDetails) {
	System.out.println("inside setter");
	this.salaryDetails = salaryDetails;
}

public ManagerEmployee(Salary salaryDetails) {
	super();
	System.out.println("Inside constructor");
	this.salaryDetails = salaryDetails;
}

public ManagerEmployee() {
	super();
	// TODO Auto-generated constructor stub
}


}
