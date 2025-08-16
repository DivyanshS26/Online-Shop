package kfru.architecture.command;

import kfru.architecture.Shop;
import kfru.architecture.helper.Logger;
import kfru.architecture.product.Product;

public class PurchaseCommand implements Command {
    private final Shop shop;
    private final String productName;
    private final boolean giftWrap;
    private final double discountPercent;
    private Product purchasedProduct;

    public PurchaseCommand(Shop shop, String productName, boolean giftWrap, double discountPercent) {
        this.shop = shop;
        this.productName = productName;
        this.giftWrap = giftWrap;
        this.discountPercent = discountPercent;
    }

    @Override
    public void execute() {
        purchasedProduct = shop.buyProduct(productName, giftWrap, discountPercent);
        Logger.log("Purchased product via command: " + (purchasedProduct != null ? purchasedProduct.name : "None"));
    }

    public Product getPurchasedProduct() {
        return purchasedProduct;
    }
}
