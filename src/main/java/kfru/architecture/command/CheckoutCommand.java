package kfru.architecture.command;

import kfru.architecture.Shop;
import kfru.architecture.billing.Billing;
import kfru.architecture.helper.Logger;
import kfru.architecture.product.Product;

public class CheckoutCommand implements Command {
    private final Shop shop;
    private final Product product;
    private final Billing billing;
    private double total;

    public CheckoutCommand(Shop shop, Product product, Billing billing) {
        this.shop = shop;
        this.product = product;
        this.billing = billing;
    }

    @Override
    public void execute() {
        if (product == null) {
            Logger.log("Checkout failed: no product.");
            total = 0;
            return;
        }
        total = shop.checkout(product, billing);
        Logger.log("Checked out product via command: " + product.name + ", total: " + total);
    }

    public double getTotal() {
        return total;
    }
}
