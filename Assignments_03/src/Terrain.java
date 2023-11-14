/**
 * Terrain 클래스는 홍수가 나는 위치를 표시하는 클래스 입니다.
 */
public class Terrain {
    private double[][] height;

    /**
     * Terrain 클래스의 생성자입니다.
     * @param heights 지형의 높이를 저장한 2차원 배열
     */
    public Terrain(double[][] heights) {
        this.height = heights;
    }

    /**
     * 홍수 지도를 출력하는데,
     * 주어진 수위인 경우 지형의 어떤 점이 홍수가 될 것인지를 보여줍니다.
     * @param waterLevel 수위 값
     */
    public void printFloodMap(double waterLevel) {
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height[i].length; j++) {
                if (height[i][j] < waterLevel) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 지형의 높이 값들 중에 최댓값을 반환합니다.
     * @return 지형의 높이 값들 중 최댓값
     */
    public double getMaxHeight() {
        double max = height[0][0];

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height[i].length; j++) {
                if (height[i][j] > max) {
                    max = height[i][j];
                }
            }
        }

        return max;
    }

    /**
     * 지형의 높이 값들 중에 최솟값을 반환합니다.
     * @return 지형의 높이 값들 중 최솟값
     */
    public double getMinHeight() {
        double min = height[0][0];

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height[i].length; j++) {
                if (height[i][j] < min) {
                    min = height[i][j];
                }
            }
        }

        return min;
    }
}
