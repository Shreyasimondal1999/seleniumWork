package com.springcore.constructorinjection;

public class Employee {
	private String name;
	private int id;
	private course cor;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", cor=" + cor + "]";
	}
	public Employee(String name, int id, course c ) {
		super();
		this.name = name;
		this.id = id;
		this.cor = c;
		
	}
//	public Employee(String name, double id, course c ) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.cor = c;
//		
//	}
//	

}
