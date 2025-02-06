import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal representation: " + octal);
    }
}
