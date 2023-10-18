package Basic_Conditional_Loops;

import java.util.Scanner;
public class Fibonacci_Series {
    public static long[] fibonacciCache;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciCache = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
    public static long fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        long nthfibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthfibonacciNumber;
        return nthfibonacciNumber;
    }

}

// 21. Fibonacci Series In Java Programs
