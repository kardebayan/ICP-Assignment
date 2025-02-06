import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
        double meanValue = mean(arr);
        double stdDeviation = deviation(arr);

        System.out.printf("The mean is %.2f%n", meanValue);
        System.out.printf("The standard deviation is %.5f%n", stdDeviation);
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum/x.length;
    }

    public static double deviation(double[] x) {
        double mean = mean(x);
        double sumSquaredDiffs = 0;
        for (int i = 0; i < x.length; i++) {
            sumSquaredDiffs += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / (x.length - 1));
    }
}
