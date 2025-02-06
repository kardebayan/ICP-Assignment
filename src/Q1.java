import java.util.Scanner;

public class Q1 {
    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return x - y;
    }

    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    public static double divisionSimple(int x, int y) {
        if (x == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return (double) y / x;
    }

    public static int remainderSimple(int n, int m) {
        if (m == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return -1;
        }
        return n % m;
    }

    public static double squareRootSimple(int n) {
        if (n < 0) {
            System.out.println("Error: Square root of negative number is not allowed.");
            return Double.NaN;
        }
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("6. Square Root");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                int a1 = input.nextInt();
                System.out.print("Enter second number: ");
                int b1 = input.nextInt();
                System.out.println("Result: " + additionSimple(a1, b1));
                break;

            case 2:
                System.out.print("Enter first number: ");
                int a2 = input.nextInt();
                System.out.print("Enter second number: ");
                int b2 = input.nextInt();
                System.out.println("Result: " + subtractionSimple(a2, b2));
                break;

            case 3:
                System.out.print("Enter first number: ");
                int a3 = input.nextInt();
                System.out.print("Enter second number: ");
                int b3 = input.nextInt();
                System.out.println("Result: " + multiplicationSimple(a3, b3));
                break;

            case 4:
                System.out.print("Enter first number: ");
                int a4 = input.nextInt();
                System.out.print("Enter second number: ");
                int b4 = input.nextInt();
                System.out.println("Result: " + divisionSimple(a4, b4));
                break;

            case 5:
                System.out.print("Enter first number: ");
                int a5 = input.nextInt();
                System.out.print("Enter second number: ");
                int b5 = input.nextInt();
                System.out.println("Result: " + remainderSimple(a5, b5));
                break;

            case 6:
                System.out.print("Enter a number: ");
                int a6 = input.nextInt();
                System.out.println("Result: " + squareRootSimple(a6));
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
