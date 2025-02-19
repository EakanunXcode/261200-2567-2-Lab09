public class Main {
    public static void main(String[] args) {
        // การใช้งาน EmailNotifier
        OrderProcessor emailOrderProcessor = new OrderProcessor(new EmailNotifier());
        Order order1 = new Order("123");
        emailOrderProcessor.processOrder(order1);

        // การใช้งาน SMSNotifier
        OrderProcessor smsOrderProcessor = new OrderProcessor(new SMSNotifier());
        Order order2 = new Order("456");
        smsOrderProcessor.processOrder(order2);
    }
}
