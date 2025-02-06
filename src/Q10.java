import java.util.Scanner;

public class Q10 {

    public static double area(double side) {
        return side * side;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(float radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double base, int height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        double squareSide = scanner.nextDouble();
        System.out.println("Area of square: " + area(squareSide));

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of rectangle: " + area(length, width));

        // Circle
        System.out.print("Enter radius of circle: ");
        float radius = scanner.nextFloat();
        System.out.println("Area of circle: " + area(radius));

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        int height = scanner.nextInt();
        System.out.println("Area of triangle: " + area(base, height));
    }
}
