import java.util.Scanner;

public class SequenceOfValues {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();

        System.out.println("Enter a set of floating-point values.  Enter " + "anything other than a number to indicate the end of the "
                + "series: ");

        while (in.hasNextDouble())
        {
            double num = in.nextDouble();
            data.add(num);
        }

        System.out.printf("The average of the values is: %f\n", data.getAverage());
        System.out.printf("The smallest value is: %f\n", data.getSmallest());
        System.out.printf("The largest values is: %f\n", data.getLargest());
        System.out.printf("The range is: %f\n", data.getRange());

    }
}
