import java.util.Scanner;
public class GeometryDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius:");
        double r = in.nextDouble();

        System.out.println("Enter height:");
        double h = in.nextDouble();

        Geometry geometry = new Geometry();

        System.out.printf("Sphere volume: %.2f\n", geometry.sphereVolume(r));
        System.out.printf("Sphere surface: %.2f\n", geometry.sphereSurface(r));
        System.out.printf("Cylinder volume: %.2f\n", geometry.cylinderVolume(r, h));
        System.out.printf("Cylinder volume: %.2f\n", geometry.cylinderSurface(r, h));
        System.out.printf("Cone volume: %.2f\n", geometry.coneVolume(r, h));
        System.out.printf("Cone volume: %.2f\n", geometry.coneSurface(r, h));
    }
}
