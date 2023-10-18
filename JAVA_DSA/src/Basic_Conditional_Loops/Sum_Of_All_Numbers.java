// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package Basic_Conditional_Loops;

import java.util.Scanner;
public class Sum_Of_All_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            n = sc.nextInt();
            System.out.println("Input: " + n);
            sum += n;
            System.out.println(sum);
        } while (n != 0);
        System.out.println("Entered 0 - Program exited.");
        sc.close();
    }
}
