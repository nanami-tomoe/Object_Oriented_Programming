import java.util.Scanner;

public class NumOrder
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && b > c) {
            System.out.println("Decreasing");
        } else if (a < b && b < c) {
            System.out.println("Increasing");
        } else {
            System.out.println("Neither");
        }
    }
}