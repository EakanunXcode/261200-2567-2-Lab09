public class Main {
    public static void main(String[] args) {
        // สร้างอินสแตนซ์ของรูปทรงต่างๆ
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape ellipse = new Ellipse(6, 4);

        // คำนวณพื้นที่
        System.out.println("Rectangle area: " + AreaCalculator.calculateArea(rectangle));
        System.out.println("Circle area: " + AreaCalculator.calculateArea(circle));
        System.out.println("Ellipse area: " + AreaCalculator.calculateArea(ellipse));
    }
}
