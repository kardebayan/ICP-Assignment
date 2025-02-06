import java.util.Scanner;

public class Q1H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        char result = findFirstNonRepeatedChar(str);
        if (result != 0) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No unique character found!");
        }
    }

    public static char findFirstNonRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && current == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return current;
            }
        }

        return 0;
    }
}
