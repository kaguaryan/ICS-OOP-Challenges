package challenges;

public class FactorialCalculator {
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, the factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        } 
          // Recursive case: n * factorial of n-1
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {
        int result = factorial(5); // Calculates the factorial of 5
        System.out.println("Factorial: " + result); // Output: Factorial: 120
    }
}
