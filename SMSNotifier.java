public class SMSNotifier implements NotificationService {
    @Override
    public void notify(String message) {
        // Logic การส่ง SMS
        System.out.println("Sending SMS: " + message);
    }
}