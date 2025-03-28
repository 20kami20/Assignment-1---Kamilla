import java.util.Scanner;

/**
 * Main class to handle user input and execute different tasks.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello user");
        System.out.println("Choose the task (1-8): ");
        int task = scanner.nextInt();
        System.out.println("Result: ");

        // Measure execution time
        long startTime = System.nanoTime();

        if (task == 1) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println("Minimum: " + findMin(arr, n));
        }
        long endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000 + " milliseconds");

        scanner.close();
    }

    /**
     * Recursively finds the minimum element in the array.
     * Time Complexity: O(n)
     */
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

}
