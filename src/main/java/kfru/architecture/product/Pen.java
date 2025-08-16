package kfru.architecture.product;

public class Pen extends Product {
    public Pen() {
        super("Pen", 1.5);
    }
    @Override
    public double getPrice() {
        return price;
    }
}