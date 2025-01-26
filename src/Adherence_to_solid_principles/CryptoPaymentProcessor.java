package Adherence_to_solid_principles;

// Liskov Substitution Principle (LSP)
// Subtypes can replace their parent types without altering functionality.
public class CryptoPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing crypto payment for order: " + order.getOrderId());
    }
}
