import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RowsOfNumbers
{

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println ("This program reads variable-length lines of numbers from a file 'data.txt'");
        System.out.println ("and prints the line along with the average.");
        File infile = new File("data.txt");
        Scanner in = new Scanner(infile);
        int rowNumber = 1;
        while (in.hasNextLine()) {
            System.out.printf("Row %d:   ", rowNumber);
            String line = in.nextLine();
            if (line.isEmpty()) {
                System.out.println("    average is 0.0");
                rowNumber++;
                continue;
            }

            String[] numberString = line.split(" ");

            double sum = 0.0;
            int n = 0;
            for (String numberStr : numberString) {
                double number = Double.parseDouble(numberStr);
                System.out.printf("%.1f ", number);
                sum += number;
                n++;
            }
            System.out.printf("    average is %.1f\n", sum/n);
            rowNumber++;
        }

    }

}