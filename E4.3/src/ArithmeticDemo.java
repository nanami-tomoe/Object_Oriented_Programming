import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a, b;
        Scanner keyIn = new Scanner(System.in);

        System.out.println("please enter a first integer: ");
        a = keyIn.nextInt();
        System.out.println("please enter a second integer: ");
        b = keyIn.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double average = (double) (a + b) / 2;
        int distance = Math.abs(difference);
        int maximum = Math.max(a, b);
        int minimum = Math.min(a, b);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(average);
        System.out.println(distance);
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
