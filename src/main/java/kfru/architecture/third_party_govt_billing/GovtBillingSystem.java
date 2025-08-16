package kfru.architecture.third_party_govt_billing;

public class GovtBillingSystem {
    public double calculateFinalAmount(double basePrice) {
        // Govt forced 20 percent tax
        return basePrice * 1.20;
    }
}
