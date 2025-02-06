import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        int length = password.length();
        int digitCount = 0;
        boolean isValid = true;

        if (length < 8) {
            isValid = false;
        }

        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
                isValid = false;
                break;
            }
        }

        if (digitCount < 2) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
