// Leetcode - 1281. Subtract the Product and Sum of Digits of an Integer

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
// Example 1:

// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15
package Basic_Conditional_Loops;

import java.util.Scanner;

public class Subtract_Product_Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        int s = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            p = p * rem;
            s = s + rem;
        }
        int f = p - s;
        System.out.println("Difference between the product of its digits and the sum of its digits is: " + f);
        sc.close();
    }
}
