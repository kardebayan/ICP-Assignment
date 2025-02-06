import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter number to be searched: ");
        int no = input.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (no == arr[i]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(no + " is not present");
        } else {
            System.out.println(no + " is present " + count + " times");
        }
    }
}
