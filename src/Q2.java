import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] count = new int[101];
        System.out.print("Enter the integers between 1 and 100 (end with 0): ");
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num >= 1 && num <= 100) {
                count[num]++;
            }
        }
        // Print the occurrences
        for (int i = 1; i <= 100; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " time" + (count[i] > 1 ? "s" : ""));
            }
        }
    }
}
