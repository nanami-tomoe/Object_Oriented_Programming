public class ReplaceTester {
    public static void main(String[] args) {
        String state = "Mississippi";

        state = state.replace("i", "!");
        state = state.replace("s", "$");

        System.out.println("Replaced: " + state);
    }
}