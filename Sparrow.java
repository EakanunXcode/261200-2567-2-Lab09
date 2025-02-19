public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("The sparrow hops on the ground.");
    }

    @Override
    public void fly() {
        System.out.println("The sparrow flies through the sky.");
    }
}