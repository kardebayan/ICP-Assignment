import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8};
        int[] rev = new int[arr.length];
        int n = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            rev[n] = arr[i];
            n++;
        }
        System.out.println(Arrays.toString(rev));
    }
}
