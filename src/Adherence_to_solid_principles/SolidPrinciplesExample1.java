package Adherence_to_solid_principles;

public class SolidPrinciplesExample1 {
    public static void main(String[] args) {
        Order order = new Order("12345", 250.00);

        // Using credit card payment and email notification
        PaymentProcessor paymentProcessor = new CreditCardPaymentProcessor();
        NotificationService notificationService = new EmailNotificationService();
        PaymentHandler paymentHandler = new PaymentHandler(paymentProcessor, notificationService);

        paymentHandler.handlePayment(order);

        // Using PayPal payment and SMS notification
        PaymentProcessor payPalProcessor = new PayPalPaymentProcessor();
        NotificationService smsService = new SMSNotificationService();
        PaymentHandler anotherHandler = new PaymentHandler(payPalProcessor, smsService);

        anotherHandler.handlePayment(order);
    }
}
