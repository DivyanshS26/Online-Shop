package kfru.architecture;

public class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPriceWithTax() {
        Logger.log("Calculating tax for: " + name);
        return price * 1.18;
    }
}