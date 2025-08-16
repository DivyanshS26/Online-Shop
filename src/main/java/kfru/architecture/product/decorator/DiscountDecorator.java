package kfru.architecture.product.decorator;

import kfru.architecture.product.Product;

public class DiscountDecorator extends ProductDecorator {
    private final double discountPercent;

    public DiscountDecorator(Product decoratedProduct, double discountPercent) {
        super(decoratedProduct);
        this.discountPercent = discountPercent;
    }

    @Override
    public double getPrice() {
        double priceBeforeDiscount = decoratedProduct.getPrice();
        return priceBeforeDiscount - (priceBeforeDiscount * discountPercent / 100);
    }
}
