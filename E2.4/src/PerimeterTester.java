import java.awt.Rectangle;

public class PerimeterTester {

    public static void main(String[] args) {

        // Rectangle r1 = new Rectangle(x좌표, y좌표, x너비, y높이);
        Rectangle r1 = new Rectangle(10, 20, 20, 30);
        double perimeter = (r1.getWidth() + r1.getHeight()) * 2;
        System.out.println("Perimeter: " + perimeter);
    }
}