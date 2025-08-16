package kfru.architecture.billing;

import kfru.architecture.product.Product;

public class DefaultTaxStrategy implements TaxStrategy {
    @Override
    public double applyTax(Product product) {
        return product.getPrice() * 1.18;
    }
}
