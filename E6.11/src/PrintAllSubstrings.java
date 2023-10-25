import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");

        String word = in.next();

        for (int i = 0; i < word.length(); i++) {
            for(int j = 0; j < word.length()-i; j++) {
                System.out.println(word.substring(j, j+1+i));
            }
        }
    }
}
