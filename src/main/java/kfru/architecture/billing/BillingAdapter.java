package kfru.architecture.billing;

import kfru.architecture.helper.Logger;
import kfru.architecture.product.Product;
import kfru.architecture.third_party_govt_billing.GovtBillingSystem;

public class BillingAdapter extends Billing {
    private final GovtBillingSystem externalBilling;

    public BillingAdapter() {
        super(null);
        externalBilling = new GovtBillingSystem();
    }

    @Override
    public double calculateTotal(Product product) {
        Logger.log("Calculating total via external billing for: " + product.name);
        return externalBilling.calculateFinalAmount(product.getPrice());
    }
}
