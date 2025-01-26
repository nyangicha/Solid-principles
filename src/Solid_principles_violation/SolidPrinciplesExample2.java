package Solid_principles_violation;

public class SolidPrinciplesExample2 {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor("12345", 250.00);

        // Hardcoded payment method and notification logic,
        // violating Open/Closed Principle (OCP).
        orderProcessor.processOrder("CreditCard");

        // To add a new payment method or notification type,
        // you need to modify the OrderProcessor class.
    }
}
