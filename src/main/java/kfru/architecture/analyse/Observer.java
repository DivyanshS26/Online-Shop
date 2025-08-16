package kfru.architecture.analyse;

import kfru.architecture.product.Product;

public interface Observer {
    void update(Product product, double total);
}