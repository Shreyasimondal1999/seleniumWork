package com.springcore.lifecyclemethods;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
public class Pepsi implements InitializingBean,DisposableBean{
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("Object creating");
	this.price = price;
}

public Pepsi(double price) {
	super();
	this.price = price;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	//init
	System.out.println("TakingPepsi");
	
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	//destroy method
	System.out.println("destroying object pepsi");
}


}
