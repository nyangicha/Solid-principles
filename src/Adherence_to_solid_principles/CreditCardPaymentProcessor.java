package Adherence_to_solid_principles;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing credit card payment for order: " + order.getOrderId());
    }
}
