public class ShopRunner {
    public static void main(String[] args) {
        // 1. Create the "Brain" of our shop
        CheckoutSystem shopScanner = new CheckoutSystem();

        // 2. Create different payment objects
        // Even though they are different types, they both "count" as PaymentMethods
        PaymentMethod myCard = new CreditCard();
        PaymentMethod myCrypto = new Bitcoin();

        System.out.println("--- Processing First Order ---");
        // We pass the CreditCard object into the general processOrder method
        shopScanner.processOrder(myCard, 50.00);

        System.out.println("\n--- Processing Second Order ---");
        // We pass the Bitcoin object into the EXACT SAME method
        shopScanner.processOrder(myCrypto, 100.00);
    }
}