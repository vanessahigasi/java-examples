package tech.bts.javaexamples.products;

public class Product {

    //fields
    private String name;
    private double price;
    private boolean available;
    private int quantity;

    //constructor
    public Product(String name, double price, boolean available, int quantity) {
        this.name = name;
        this.price = price;
        this.available = available;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }
}
