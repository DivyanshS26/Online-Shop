package kfru.architecture.product.decorator;

import kfru.architecture.product.Product;

public abstract class ProductDecorator extends Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        super(decoratedProduct.name, decoratedProduct.price);
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice();
    }
}

