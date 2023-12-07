import java.io.FileNotFoundException;

/**
 * CSVReaderTester 클래스는 CSVReader 클래스를 테스트하는 클레스입니다.
 * CSV파일을 열어 열과 행의 개수와 열과 행별로 저장되어 있는 값을 출력합니다.
 */
public class CSVReaderTester {
    /**
     * main 메소드는 프로그램의 진입점입니다.
     * @param args 명령줄 인수
     */
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();
        String fileName = "att2020.csv";
        try {
            csvReader.readFile(fileName);

            int numberOfRows = csvReader.numberOfRows();
            System.out.println("Number of rows: " + numberOfRows);
            System.out.println("Expected: " + numberOfRows + "\n");

            int numberOfFields = csvReader.numberOfFields(0);
            System.out.println("Number of fields in the one row: " + numberOfFields);
            System.out.println("Expected: " + numberOfFields + "\n");

            int row = 10;
            for (int i = 1; i <= 7; i++) {
                String fieldValue = csvReader.field(row-1, i-1);
                System.out.printf("Row %d, Col %d: %s\n", row, i, fieldValue);
                System.out.println("Expected: " + fieldValue + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
