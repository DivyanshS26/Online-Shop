package kfru.architecture.product;

public class Notebook extends Product {
    public Notebook() {
        super("Notebook", 3.0);
    }
    @Override
    public double getPrice() {
        return price;
    }
}
