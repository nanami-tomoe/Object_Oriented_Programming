import java.util.Scanner;

/**
 * This class tests the HybridCar class and takes input
 * from the user to calculate the cost of owning the car for five years.
 */
public class HybridCarTester {
    /**
     * The entry point of the program.
     * It prompts the user for input regarding car-related information, creates a HybridCar object,
     * and calculates the total cost of ownership, then displays the result.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What was the cost of the car? ");
        double carCost = in.nextDouble();
        System.out.print("How many miles per year will you drive the car? ");
        double milesPerYear = in.nextDouble();
        System.out.print("What was the cost of a gallon of gas? ");
        double gasPrice = in.nextDouble();
        System.out.print("How many miles per gallon does the car average? ");
        double efficiency = in.nextDouble();
        System.out.print("What was the resale value of the car after five years? ");
        double resaleValue = in.nextDouble();

        HybridCar car = new HybridCar(carCost, milesPerYear, gasPrice, efficiency, resaleValue);
        System.out.printf("The total cost of ownership is %.1f", car.getValue());
    }
}
