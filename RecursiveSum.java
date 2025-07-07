package challenges;

public class

    public static int sum(int n) {
        // Base case: if n is 1, the sum is 1
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: n + sum of n-1
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = sum(5); // Calculates the sum of numbers from 1 to 5
        System.out.println("Sum: " + result); // Output: Sum: 15
    }
}
