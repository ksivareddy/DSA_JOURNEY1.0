package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects : ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the Subject Marks " + (i+1) + ": ");
            int number = sc.nextInt();
            sum += number;
        }
        double average = (double) sum / N;
        System.out.println("Average Marks " + average);
        sc.close();
    }
}

