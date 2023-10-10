import java.util.Scanner;

public class DigitPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a 5 digit integer: ");
        int number = in.nextInt();
        System.out.print(number / 10000);
        System.out.print(" ");
        number %= 10000;
        System.out.print(number / 1000);
        System.out.print(" ");
        number %= 1000;
        System.out.print(number / 100);
        System.out.print(" ");
        number %= 100;
        System.out.print(number / 10);
        System.out.print(" ");
        number %= 10;
        System.out.print(number);
    }
}
