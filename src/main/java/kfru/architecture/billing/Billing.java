package kfru.architecture.billing;

import kfru.architecture.helper.Logger;
import kfru.architecture.product.Product;

public class Billing {
    private final TaxStrategy taxStrategy;
    public Billing(final TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }
    public double calculateTotal(Product product) {
        Logger.log("Calculating total for: " + product.name);
        return taxStrategy.applyTax(product);
    }
}
