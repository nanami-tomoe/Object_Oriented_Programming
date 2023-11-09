import java.util.Scanner;

public class GeometryDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = in.nextDouble();
        System.out.println("Enter height: ");
        double height = in.nextDouble();

        System.out.printf("Sphere volume: %.2f\n", Sphere.sphereVolume(radius));
        System.out.printf("Sphere surface: %.2f\n", Sphere.sphereSurface(radius));
        System.out.printf("Cylinder volume: %.2f\n", Cylinder.cylinderVolume(radius, height));
        System.out.printf("Cylinder surface: %.2f\n", Cylinder.cylinderSurface(radius, height));
        System.out.printf("Cone volume: %.2f\n", Cone.coneVolume(radius, height));
        System.out.printf("Cone surface: %.2f\n", Cone.coneSurface(radius, height));
    }
}
