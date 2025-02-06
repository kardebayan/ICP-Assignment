import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int n = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a. Create an array");
            System.out.println("b. Display array elements");
            System.out.println("c. Insert an element at a specific position");
            System.out.println("d. Delete an element at a given position");
            System.out.println("e. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 'a':
                    System.out.print("Enter the size of the array: ");
                    n = scanner.nextInt();
                    array = new int[n];
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        array[i] = scanner.nextInt();
                    }
                    break;

                case 'b':
                    if (array == null) {
                        System.out.println("Array not created yet!");
                    } else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 'c':
                    if (array == null) {
                        System.out.println("Array not created yet!");
                        break;
                    }
                    System.out.print("Enter the position to insert (0 to " + n + "): ");
                    int pos = scanner.nextInt();
                    if (pos < 0 || pos > n) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    int[] newArray = new int[n + 1];
                    for (int i = 0, j = 0; i <= n; i++) {
                        if (i == pos) {
                            newArray[i] = element;
                        } else {
                            newArray[i] = array[j++];
                        }
                    }
                    array = newArray;
                    n++;
                    System.out.println("Element inserted successfully.");
                    break;

                case 'd':
                    if (array == null || n == 0) {
                        System.out.println("Array not created or empty!");
                        break;
                    }
                    System.out.print("Enter the position to delete (0 to " + (n - 1) + "): ");
                    int delPos = scanner.nextInt();
                    if (delPos < 0 || delPos >= n) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = delPos; i < n - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    n--;
                    System.out.println("Element deleted successfully.");
                    break;

                case 'e':
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
