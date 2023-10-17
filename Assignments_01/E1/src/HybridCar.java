/**
 * This class helps a person decide whether to buy a hybrid car.
 * Calculate and return the total cost of owning the car in five years from the information.
 */
public class HybridCar {
    private double carCost;
    private double milesPerYear;
    private double gasPrice;
    private double efficiency;
    private double resaleValue;


    /**
     * This is the constructor of the HybridCar class.
     * @param cCost The cost of a new car
     * @param yMiles The estimated miles driven per year
     * @param gPrice The estimated gas price
     * @param mEfficiency The efficiency in miles per gallon
     * @param rValue The estimated resale value after 5 years
     */
    public HybridCar (double cCost, double yMiles, double gPrice, double mEfficiency, double rValue) {
        carCost = cCost;
        milesPerYear = yMiles;
        gasPrice = gPrice;
        efficiency = mEfficiency;
        resaleValue = rValue;
    }

    /**
     * Gets the total cost of owning the car for five years.
     * @return the total cost
     */
    public double getValue() {
        return carCost + (5 * gasPrice * (milesPerYear / efficiency)) - resaleValue;
    }
}
