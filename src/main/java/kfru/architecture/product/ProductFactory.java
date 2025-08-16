package kfru.architecture.product;

public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equals("Pen")) {
            return new Pen();
        } else if (type.equals("Notebook")) {
            return new Notebook();
        } else {
            return null;
        }
    }
}
