package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the numbers " + i + ": ");
            int number = sc.nextInt();
            sum += number;
        }
        double average = (double) sum / N;
        System.out.println("Average Numbers " + average);
        sc.close();
    }
}
