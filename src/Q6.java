import java.util.Scanner;

public class Q6 {

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char inputChar = scanner.next().charAt(0);

        int occurrences = count(inputString, inputChar);

        System.out.println("The character '" + inputChar + "' occurs " + occurrences + " times in the string.");
    }
}