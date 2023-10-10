import java.util.Scanner;

public class MileageDemo
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of gallons of gas in the tank: ");
        double gallon = in.nextDouble(); // 차에 있는 가스량
        System.out.print("Enter the fuel efficiency (miles per gallon): ");
        int efficiency = in.nextInt(); // 한 갤런당 갈수있는 마일, 효율 = 마일/갤런
        System.out.print("Enter the price of gas per gallon (in US $): ");
        double price = in.nextDouble(); // 한 갤런당 가격
        double cost = 100.0/efficiency*price; // 갤런 = 마일/효율
        System.out.printf("To drive 100 miles, it will cost $%.2f.\n", cost);
        double current = efficiency*gallon;
        System.out.printf("The car can currently drive a maximum of %f miles.", current);
    }
}