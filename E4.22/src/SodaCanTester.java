import java.util.Scanner;

public class SodaCanTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the height of sodacan: ");
        double height = in.nextDouble();

        System.out.print("Please enter the diameter of sodacan: ");
        double diameter = in.nextDouble();

        SodaCan SodaCan = new SodaCan(height, diameter);

        System.out.print("Volume: ");
        System.out.print(SodaCan.getVolume());

        System.out.print("\nSurface Area: ");
        System.out.print(SodaCan.getSurfaceArea());
    }
}
