package tech.bts.javaexamples.products;

public class Product {

    //fields
    private String name;
    private double price;
    private boolean available;

    //constructor
    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    //getters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}
