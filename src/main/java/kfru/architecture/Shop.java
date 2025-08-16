package kfru.architecture;

import kfru.architecture.billing.Billing;
import kfru.architecture.billing.DefaultTaxStrategy;
import kfru.architecture.helper.Logger;
import kfru.architecture.product.Product;
import kfru.architecture.product.ProductFactory;

public class Shop {
    public Product buyProduct(String name) {
        Logger.log("Buying product: " + name);
        return ProductFactory.createProduct(name);
    }

    public double checkout(Product product) {
        Billing biller = new Billing(new DefaultTaxStrategy());
        Logger.log("Checking out product: " + product.name);
        return biller.calculateTotal(product);
    }
}