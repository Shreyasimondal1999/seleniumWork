package collectionINJava;

public class Helmet1 {
    private String brand;
    private String model;
    private double price;
 
    public Helmet1(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
 
    public String getBrand() {
        return brand;
    }
 
    public String getModel() {
        return model;
    }
 
    public double getPrice() {
        return price;
    }
 
    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price;
    }
}
