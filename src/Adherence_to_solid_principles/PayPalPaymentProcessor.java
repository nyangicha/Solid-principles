package Adherence_to_solid_principles;

public class PayPalPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing PayPal payment for order: " + order.getOrderId());
    }
}
