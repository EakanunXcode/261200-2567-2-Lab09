public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("The eagle walks slowly on the ground.");
    }

    @Override
    public void fly() {
        System.out.println("The eagle soars high in the sky.");
    }
}