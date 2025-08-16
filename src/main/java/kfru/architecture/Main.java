package kfru.architecture;

import kfru.architecture.analyse.AnalyticsObserver;
import kfru.architecture.analyse.InventoryObserver;
import kfru.architecture.billing.Billing;
import kfru.architecture.billing.BillingAdapter;
import kfru.architecture.billing.DefaultTaxStrategy;
import kfru.architecture.command.CheckoutCommand;
import kfru.architecture.command.CommandInvoker;
import kfru.architecture.command.PurchaseCommand;
import kfru.architecture.product.Product;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.registerObserver(new InventoryObserver());
        shop.registerObserver(new AnalyticsObserver());

        CommandInvoker invoker = new CommandInvoker();


        PurchaseCommand purchasePen = new PurchaseCommand(shop, "Pen", true, 10);
        invoker.executeCommand(purchasePen);
        Product pen = purchasePen.getPurchasedProduct();


        Billing billingAdapter = new BillingAdapter();


        CheckoutCommand checkoutPen = new CheckoutCommand(shop, pen, billingAdapter);
        invoker.executeCommand(checkoutPen);
        System.out.println(pen.name + " - Total: $" + checkoutPen.getTotal());


        PurchaseCommand purchaseNotebook = new PurchaseCommand(shop, "Notebook", false, 0);
        invoker.executeCommand(purchaseNotebook);
        Product notebook = purchaseNotebook.getPurchasedProduct();


        Billing defaultBilling = new Billing(new DefaultTaxStrategy());

        CheckoutCommand checkoutNotebook = new CheckoutCommand(shop, notebook, defaultBilling);
        invoker.executeCommand(checkoutNotebook);
        System.out.println(notebook.name + " - Total: $" + checkoutNotebook.getTotal());
    }
}
