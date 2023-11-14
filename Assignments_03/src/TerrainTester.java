import java.util.Scanner;

/**
 * TerrainTester 클래스는 수위가 증가함에 따라 홍수가 나는 위치를 출력하는 클래스 입니다.
 */
public class TerrainTester {
    /**
     * 프로그램의 진입점입니다.
     * 사용자로부터 지형의 높이를 2차원 배열로 입력받고, 수위에 따른 홍수 위치를 출력합니다.
     * @param args 외부의 문자열 입력을 받기 위한 인자
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter height values:");
        double[][] heights = new double[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                heights[i][j] = in.nextDouble();
            }
        }

        Terrain terrain = new Terrain(heights);
        double min = terrain.getMinHeight();
        double max = terrain.getMaxHeight();

        double increment = (max - min) / 9;
        double level = min;

        System.out.println("Lowest Height: " + min);
        System.out.println("Highest Height: " + max);

        for (int i = 0; i < 10; i++) {
            System.out.println("Water Level: " + level);
            terrain.printFloodMap(level);
            level += increment;
        }
    }
}
