import java.util.Scanner;

public class MaxOfThree
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter three numbers: ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if (a >= b && a >= c) {
            System.out.printf("The largest number is %.1f", a);
        } else if (b >= a && b >= c) {
            System.out.printf("The largest number is %.1f", b);
        } else {
            System.out.printf("The largest number is %.1f", c);
        }
    }
}
