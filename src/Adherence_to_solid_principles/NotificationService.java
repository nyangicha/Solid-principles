package Adherence_to_solid_principles;

// Interface Segregation Principle (ISP)
// Separate interfaces to avoid forcing implementation of unused methods.
public interface NotificationService {
    void sendNotification(String message);
}
