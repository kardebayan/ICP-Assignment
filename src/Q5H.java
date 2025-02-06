import java.util.Scanner;

public class Q5H {
    public static boolean areConsecutive(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max; // The middle number

        return (mid == min + 1) && (max == mid + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

        boolean result = areConsecutive(num1, num2, num3);

        System.out.println("Check whether the three said numbers are consecutive or not!");
        System.out.println(result);

    }
}
