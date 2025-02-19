public class EmailNotifier implements NotificationService {
    @Override
    public void notify(String message) {
        // Logic การส่งอีเมล
        System.out.println("Sending Email: " + message);
    }
}