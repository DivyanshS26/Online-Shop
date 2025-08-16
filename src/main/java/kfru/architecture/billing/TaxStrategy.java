package kfru.architecture.billing;

import kfru.architecture.product.Product;

public interface TaxStrategy {
    double applyTax(Product product);
}
