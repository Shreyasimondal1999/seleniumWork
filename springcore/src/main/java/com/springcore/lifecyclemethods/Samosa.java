package com.springcore.lifecyclemethods;

public class Samosa {
	private double price;

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa(double price) {
		super();
		System.out.println("Constructor creating");
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}

}
