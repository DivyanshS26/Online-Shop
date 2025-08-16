package kfru.architecture.product;

public abstract class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double getPrice();
}