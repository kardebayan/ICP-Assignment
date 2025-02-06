import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(bubble(arr)));
    }

    public static double[] bubble(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    double temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
