package First_Java_Problems;

// 7. To calculate Fibonacci Series up to n numbers.
import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int fibonacciNumber = fib(a);
        System.out.println("The Fibonacci number at " + a + " is: " + fibonacciNumber);
        fibmethod2(a);
        sc.close();
    }

    public static void fibmethod2(int a ){

        int b = 0, c = 1 ;
        if (a == 0) {
            System.out.println("The Fibonacci number method 2 at position 0 is: " + b);
        } else if (a == 1){
            System.out.println("The Fibonacci number method 2 at position 0 is: " + c);
        }
        else {
            for (int i = 2; i <= a; i++) {
                int temp = b + c ;
                b = c;
                c= temp;
            }
            System.out.println("The Fibonacci number method 2 at position " + a + " is: " + c);
        }
    }
      public static int fib(int n) {
            if (n <= 1) {
               return n;
               } else {
                return fib (n-1) + fib (n-2);
               }
        }
         
}

