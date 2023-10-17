import java.util.Scanner;

/**
 * This class allows the user to input the coordinates of three vertices of a triangle
 * and then calculates and prints coordinates, lengths, angles, perimeter, and area.
 */
public class TriangleTester {
    /**
     * The main entry point of the program. It prompts the user for input regarding the coordinates of the triangle's vertices,
     * creates a `Triangle` object, and then prints the coordinates, lengths, angles, perimeter, and area of the triangle.
     * @param args args The command-line arguments (not used).
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Vertex x1? ");
        double x1 = in.nextDouble();
        System.out.print("Vertex y1? ");
        double y1 = in.nextDouble();
        System.out.print("Vertex x2? ");
        double x2 = in.nextDouble();
        System.out.print("Vertex y2? ");
        double y2 = in.nextDouble();
        System.out.print("Vertex x3? ");
        double x3 = in.nextDouble();
        System.out.print("Vertex y3? ");
        double y3 = in.nextDouble();

        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);

        triangle.printDot();
        triangle.printLengthAngle();
        triangle.printPerimeterArea();
    }
}