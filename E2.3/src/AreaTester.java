import java.awt.Rectangle;

public class AreaTester {
    public static void main(String[] args) {
        // Rectangle r1 = new Rectangle(x좌표, y좌표, x너비, y높이);
        Rectangle r1 = new Rectangle(10, 20, 50, 70);
        double area = r1.getWidth() * r1.getHeight();
        System.out.println("Area: " + area);
        System.out.println("Expected: 3500");
    }
}