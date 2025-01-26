package Solid_principles_violation;

// This class violates the Single Responsibility Principle (SRP).
// It is responsible for order management, payment processing, and notifications.
public class OrderProcessor {
    private String orderId;
    private double amount;

    public OrderProcessor(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    // This method processes the payment and sends notifications.
    // It combines multiple responsibilities in a single method.
    public void processOrder(String paymentMethod) {
        if (paymentMethod.equalsIgnoreCase("CreditCard")) {
            System.out.println("Processing credit card payment for order: " + orderId);
        } else if (paymentMethod.equalsIgnoreCase("PayPal")) {
            System.out.println("Processing PayPal payment for order: " + orderId);
        } else if (paymentMethod.equalsIgnoreCase("Crypto")) {
            System.out.println("Processing crypto payment for order: " + orderId);
        } else {
            System.out.println("Unknown payment method: " + paymentMethod);
        }

        // Sending notification directly, violating Dependency Inversion Principle (DIP).
        System.out.println("Sending email notification for order: " + orderId);
    }
}
