import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeleteBlankLinesTester {
    public static void main(String[] args) {
        BlankLinesRemover.removeLines("line.txt");
        int count = 0;
        try (Scanner in = new Scanner(new File("lines.txt"))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Number of non-blank lines: " + count);
    }
}
