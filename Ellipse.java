public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }
}
