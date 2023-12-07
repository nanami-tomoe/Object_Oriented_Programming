import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CSV 파일을 열과 행별로 나누어 읽는 클래스입니다.
 */
public class CSVReader {
    private List<List<String>> data;

    /**
     * CSV 파일을 읽어 데이터를 저장합니다.
     *
     * @param fileName 읽을 CSV 파일의 이름
     * @throws FileNotFoundException 파일이 존재하지 않을 때 발생하는 예외
     */
    public void readFile(String fileName) throws FileNotFoundException {
        data = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                List<String> row = parseCSVLine(line);
                data.add(row);
            }
        }
    }

    /**
     * CSV 파일의 행(row) 개수를 반환합니다.
     *
     * @return 행의 개수
     */
    public int numberOfRows() {
        return data.size();
    }

    /**
     * 주어진 행(row)의 필드(field) 개수를 반환합니다.
     *
     * @param row 행 번호
     * @return 필드의 개수
     */
    public int numberOfFields(int row) {
        if (row >= 0 && row < data.size()) {
            return data.get(row).size();
        } else {
            return 0;
        }
    }

    /**
     * 주어진 행(row)과 열(column)에 해당하는 필드(field) 값을 반환합니다.
     *
     * @param row    행 번호
     * @param column 열 번호
     * @return 필드 값
     */
    public String field(int row, int column) {
        if (row >= 0 && row < data.size()) {
            List<String> rowList = data.get(row);
            if (column >= 0 && column < rowList.size()) {
                return rowList.get(column);
            }
        }
        return null;
    }

    /**
     * CSV 파일의 한 줄을 파싱하여 필드로 구분된 리스트로 변환합니다.
     *
     * @param line CSV 파일의 한 줄
     * @return 필드로 구분된 리스트
     */
    private List<String> parseCSVLine(String line) {
        List<String> rows = new ArrayList<>();
        StringBuilder field = new StringBuilder();
        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '"') {
                if (inQuotes) {
                    if (i < line.length() - 1 && line.charAt(i + 1) == ',') {
                        inQuotes = false;
                        rows.add(field.toString().trim());
                        field.setLength(0);
                        i++;
                    } else if (i < line.length() - 1 && line.charAt(i + 1) == '"') {
                        field.append('"');
                        inQuotes = false;
                        rows.add(field.toString().trim());
                        field.setLength(0);
                        i++;
                    } else {
                        field.append('"');
                    }
                } else {
                    inQuotes = true;
                }
            } else if (c == ',' && !inQuotes) {
                rows.add(field.toString().trim());
                field.setLength(0);
            } else {
                field.append(c);
            }
        }

        return rows;
    }
}
