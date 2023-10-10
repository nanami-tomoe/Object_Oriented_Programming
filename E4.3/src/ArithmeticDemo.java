import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int value1, value2;
        Scanner keyIn = new Scanner(System.in);

        System.out.println("please enter a first integer: ");
        value1 = keyIn.nextInt();
        System.out.println("please enter a second integer: ");
        value2 = keyIn.nextInt();

        int sum = value1 + value2;
        int difference = value1 - value2;
        int product = value1 * value2;
        double average = (double) (value1 + value2) / 2;
        int distance = Math.abs(difference);
        int maximum = Math.max(value1, value2);
        int minimum = Math.min(value1, value2);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(average);
        System.out.println(distance);
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
