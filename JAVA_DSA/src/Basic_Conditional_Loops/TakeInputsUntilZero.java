// Take integer inputs till the user enters 0 and print the largest number from all.
package Basic_Conditional_Loops;

import java.util.Scanner;
public class TakeInputsUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int largest = Integer.MIN_VALUE;
        do {
            n = sc.nextInt();
            if (n > largest) {
                largest = n;
            }
        } while (n != 0);
        System.out.println("Largest number entered: " + largest);
        sc.close();
    }
}
