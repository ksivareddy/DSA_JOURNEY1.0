package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of digits: " + SumDigits(num));

        sc.close();

    }

    public static int SumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n = n / 10;
        }
        return sum;
    }
}
