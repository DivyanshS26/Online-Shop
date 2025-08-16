package kfru.architecture;

public class Shop {
    public Product buyProduct(String name) {
        Logger.log("Buying product: " + name);
        if (name.equals("Pen")) {
            return new Product("Pen", 1.5);
        } else if (name.equals("Notebook")) {
            return new Product("Notebook", 3.0);
        } else {
            return null;
        }
    }

    public double checkout(Product product) {
        Billing biller = new Billing();
        Logger.log("Checking out product: " + product.name);
        return biller.calculateTotal(product);
    }
}