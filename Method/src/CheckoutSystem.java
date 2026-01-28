// The "Secret" Contract
abstract class PaymentMethod {
    abstract void authorize(double amount);
}

// Subclasses (The Plugins)
class CreditCard extends PaymentMethod {
    void authorize(double amount) {
        System.out.println("Validating card with Bank...");
    }
}

class Bitcoin extends PaymentMethod {
    void authorize(double amount) {
        System.out.println("Checking Blockchain ledger...");
    }
}

// THE ORGANIZED SOFTWARE PART:
public class CheckoutSystem {
    // This method handles ANY payment method. It doesn't care which one!
    public void processOrder(PaymentMethod method, double total) {
        method.authorize(total); // This line is the "Secret."
        System.out.println("Order Complete.");
    }
}