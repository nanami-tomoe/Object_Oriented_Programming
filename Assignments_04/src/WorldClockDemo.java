import java.util.Scanner;

/**
 * WorldClockDemo 클래스는 Clock 클래스와 WorldClock 클래스를 테스트하는 데모 프로그램입니다.
 * 사용자로부터 시간대 오프셋을 입력받아 해당 시간대의 현재 시간을 출력합니다.
 */
public class WorldClockDemo {
    /**
     * main 메소드는 프로그램의 진입점입니다.
     * @param args 명령줄 인수
     */
    public static void main(String[] args) {
        Clock Clock = new Clock();
        System.out.println("Base Time in Current Time-Zone");
        System.out.printf("Hours: %d\n", Clock.getHours());
        System.out.printf("Minutes: %d\n", Clock.getMinutes());
        System.out.println("Time: " + Clock.getTime() + "\n");

        Scanner in = new Scanner(System.in);

        System.out.print("World Clock offset: ");
        int offset = in.nextInt();
        WorldClock WorldClock = new WorldClock(offset);
        System.out.printf("Hours: %d\n", WorldClock.getHours());
        System.out.printf("Minutes: %d\n", WorldClock.getMinutes());
        System.out.println("Time: " + WorldClock.getTime());
    }
}
