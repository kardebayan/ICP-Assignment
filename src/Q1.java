import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + (double)sum/arr.length);

    }
}
