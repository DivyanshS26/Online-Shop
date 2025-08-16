package kfru.architecture.analyse;

import kfru.architecture.helper.Logger;
import kfru.architecture.product.Product;

public class AnalyticsObserver implements Observer {
    @Override
    public void update(Product product, double total) {
        Logger.log("Analytics updated for product: " + product.name + ", total sale: " + total);
    }
}
