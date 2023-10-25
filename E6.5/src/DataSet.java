public class DataSet {
    private double sum;
    private double smallestValue;
    private double largestValue;
    private int n;

    public DataSet() {
        sum = 0;
        n = 0;
        smallestValue = Double.MAX_VALUE;
        largestValue = Double.MIN_VALUE;
    }

    public void add(double x) {
        sum += x;
        n++;
        if (x > largestValue) {
            largestValue = x;
        }
        if (x < smallestValue) {
            smallestValue = x;
        }
    }

    public double getAverage() {
        return sum / n;
    }

    public double getSmallest() {
        return smallestValue;
    }

    public double getLargest() {
        return largestValue;
    }

    public double getRange() {
        return largestValue - smallestValue;
    }

    public int getCount() {
        return n;
    }
}
