/**
 * PrimeGenerator는 특정 범위 내의 소수를 생성하는 클래스 입니다.
 */
public class PrimeGenerator {
    private int limitNum;

    /**
     * PrimeGenerator 객체를 생성하는 생성자입니다.
     * @param limit 소수를 생성할 범위의 상한값
     */
    public PrimeGenerator(int limit) {
        limitNum = limit;
    }

    /**
     * 범위 내의 소수 중 입력받은 이전 소수보다 큰 소수 중 가장 작은 소수를 반환하고,
     * 범위를 벗어나면 -1을 반환합니다.
     * @param previousPrime 이전 소수
     * @return 범위 내의 소수 중 이전 소수보다 큰 소수 중 가장 작은 소수
     */
    public int nextPrime(int previousPrime) {
        int num = previousPrime + 1;

        while (!isPrime(num)) {
            num ++;
        }

        if (num > limitNum) return -1;
        return num;
    }

    /**
     * 입력받은 수가 소수인지 여부를 판별합니다.
     * @param num 판별할 숫자
     * @return 주어진 숫자가 소수이면 true, 그렇지 않으면 false
     */
    public boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i < num-1; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
