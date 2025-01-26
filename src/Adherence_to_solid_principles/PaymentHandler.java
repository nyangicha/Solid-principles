package Adherence_to_solid_principles;

// Dependency Inversion Principle (DIP)
// High-level modules do not depend on low-level modules. Both depend on abstractions.
public class PaymentHandler {
    private final PaymentProcessor paymentProcessor;
    private final NotificationService notificationService;

    public PaymentHandler(PaymentProcessor paymentProcessor, NotificationService notificationService) {
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    public void handlePayment(Order order) {
        paymentProcessor.processPayment(order);
        notificationService.sendNotification("Payment processed for order: " + order.getOrderId());
    }
}
