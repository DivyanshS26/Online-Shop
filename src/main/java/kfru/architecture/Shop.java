package kfru.architecture;

import kfru.architecture.analyse.Subject;
import kfru.architecture.billing.Billing;
import kfru.architecture.helper.Logger;
import kfru.architecture.product.Product;
import kfru.architecture.product.ProductFactory;
import kfru.architecture.product.decorator.DiscountDecorator;
import kfru.architecture.product.decorator.GiftWrapDecorator;

public class Shop extends Subject {
    public Product buyProduct(String name, boolean giftWrap, double discountPercent) {
        Logger.log("Buying product: " + name);
        Product product = ProductFactory.createProduct(name);
        if (product == null) return null;

        if (giftWrap) {
            product = new GiftWrapDecorator(product);
        }
        if (discountPercent > 0) {
            product = new DiscountDecorator(product, discountPercent);
        }
        return product;
    }

    public double checkout(Product product, Billing billing) {
        Logger.log("Checking out product: " + product.name);
        double total = billing.calculateTotal(product);
        notifyObservers(product, total);
        return total;
    }
}

