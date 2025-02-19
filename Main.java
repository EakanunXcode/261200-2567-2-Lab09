public class Main {
    public static void main(String[] args) {
        Moveable penguin = new Penguin();
        Moveable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        penguin.move(); // The penguin waddles on the ground.
        ostrich.move(); // The ostrich runs at high speed.
        sparrow.move(); // The sparrow hops on the ground.
        sparrow.fly();  // The sparrow flies through the sky.
        eagle.move();   // The eagle walks slowly on the ground.
        eagle.fly();    // The eagle soars high in the sky.
    }
}
