import java.util.Scanner;

public class Q2H {

    public static double volume(double side) {
        return side * side * side;
    }

    public static double volume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cube Volume
        System.out.print("Enter side length of the cube: ");
        double side = scanner.nextDouble();
        System.out.println("Volume of Cube: " + volume(side));

        // Sphere Volume
        System.out.print("Enter radius of the sphere: ");
        double radius = scanner.nextDouble();
        System.out.println("Volume of Sphere: " + volume(radius, true));

        // Cuboid Volume
        System.out.print("Enter length, breadth, and height of the cuboid: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Volume of Cuboid: " + volume(length, breadth, height));

        scanner.close();
    }
}
