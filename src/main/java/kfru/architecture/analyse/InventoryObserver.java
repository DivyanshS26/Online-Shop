package kfru.architecture.analyse;

import kfru.architecture.helper.Logger;
import kfru.architecture.product.Product;

public class InventoryObserver implements Observer {
    @Override
    public void update(Product product, double total) {
        Logger.log("Inventory updated for product: " + product.name);
    }
}

