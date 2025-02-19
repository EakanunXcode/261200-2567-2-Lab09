public class OrderProcessor {
    private final NotificationService notificationService;

    // Dependency Injection ผ่าน Constructor
    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        // Logic การประมวลผลคำสั่งซื้อ
        System.out.println("Processing Order: " + order.getOrderId());

        // ส่งการแจ้งเตือน
        notificationService.notify("Order " + order.getOrderId() + " processed.");
    }
}
