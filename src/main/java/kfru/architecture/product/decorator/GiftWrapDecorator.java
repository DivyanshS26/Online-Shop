package kfru.architecture.product.decorator;

import kfru.architecture.product.Product;

public class GiftWrapDecorator extends ProductDecorator {

    public GiftWrapDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        double giftWrapCost = 0.5;
        return decoratedProduct.getPrice() + giftWrapCost;
    }
}