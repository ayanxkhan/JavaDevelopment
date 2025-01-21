package basicMaths;

import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        System.out.println("Enter a number up to which you want the Fibonacci sum: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fib;
        int sum = 0; // Start sum at 0
        int a = 0;   // First Fibonacci number
        int b = 1;   // Second Fibonacci number

        for (int i = 1; i <= num; i++) { // Start from i = 1 to include only valid numbers
            fib = a + b;
            sum += b; // Add the current Fibonacci number
            a = b;    // Update 'a' to the next Fibonacci number
            b = fib;  // Update 'b' to the next Fibonacci number
        }

        System.out.println("The sum of Fibonacci numbers up to " + num + " is: " + sum);
        sc.close(); // Close the scanner
    }
}
