import java.util.HashSet;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(arr);

        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : list) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
}
