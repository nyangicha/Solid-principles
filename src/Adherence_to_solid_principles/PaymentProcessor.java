package Adherence_to_solid_principles;

// Open/Closed Principle (OCP)
// PaymentProcessor is open for extension (via new payment methods) but closed for modification.
public interface PaymentProcessor {
    void processPayment(Order order);
}
