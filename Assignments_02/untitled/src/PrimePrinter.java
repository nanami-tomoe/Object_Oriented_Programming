import java.util.Scanner;

/**
 * PrimePrinter는 입력한 상한값까지의 소수를 출력하는 클래스입니다.
 */
public class PrimePrinter {
    /**
     * 프로그램의 진입점입니다.
     * 사용자로부터 상한값을 입력받고, 해당 상한값까지의 소수를 출력합니다.
     * @param args 외부의 문자열 입력을 받기 위한 인자
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter upper limit: ");
        int limit = in.nextInt();

        PrimeGenerator prime = new PrimeGenerator(limit);

        int i = 1;
        while(prime.nextPrime(i) > 0) {
            System.out.printf("%d ", prime.nextPrime(i));
            i = prime.nextPrime(i);
        }
    }
}
