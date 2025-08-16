package kfru.architecture;

public class Billing {
    public double calculateTotal(Product product) {
        Logger.log("Calculating total for: " + product.name);
        return product.getPriceWithTax();
    }
}
