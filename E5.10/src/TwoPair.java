import java.util.Scanner;

public class TwoPair
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pair");
        }
    }
}