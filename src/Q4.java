import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println(min(array));
    }

    public static double min(double[] array) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    min = Math.min(min, array[i]);
                }
            }
        }
        return min;
    }
}
