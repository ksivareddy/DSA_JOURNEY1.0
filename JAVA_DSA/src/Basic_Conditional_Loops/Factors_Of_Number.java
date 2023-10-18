// Input a number and print all the factors of that number (use loops).
package Basic_Conditional_Loops;

import java.util.Scanner;
public class Factors_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factors(n);
        sc.close();

    }
    public static void factors(int n ){
      for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
