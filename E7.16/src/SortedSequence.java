import java.util.Arrays;
import java.util.Random;

public class SortedSequence
{

    /**
     Makes an array with n random values between 0-99.
     @param n the number of tosses to simulate
     @return an array with n random die tosses in it
     */
    public int[] generateRandom(int n)
    {
        int[] data = new int[n];
        Random generator = new Random();

        for (int i = 0; i < n; i++) {
            data[i] = generator.nextInt(20) + 1;
        }

        return data;
    }
    /**
     Prints an array.
     @param values the array to print
     */
    public void printArray(int[] values)
    {
        int length = values.length;

        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", values[i]);
        }
        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        SortedSequence util = new SortedSequence();

        int[] values = util.generateRandom(20);

        util.printArray(values);
        Arrays.sort(values);
        util.printArray(values);
    }
}
