public class HollePrinter {

    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++){
            if (charArray[i] == 'e'){
                charArray[i] = 'o';
            }
            else if (charArray[i] == 'o'){
                charArray[i] = 'e';
            }
        }

        String swappedString = new String(charArray);

        System.out.println(swappedString);

    }
}