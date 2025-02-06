import java.util.Scanner;

public class Q3H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        int middleIndex = length / 2;

        char middleChar = (length % 2 == 0) ? input.charAt(middleIndex) : input.charAt(middleIndex);

        System.out.println("The middle character in the string: " + middleChar);

    }
}
