package Adherence_to_solid_principles;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
