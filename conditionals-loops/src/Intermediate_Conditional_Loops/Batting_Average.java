package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Total_Runs = sc.nextInt();
        int Number_of_Dismissals = sc.nextInt();
        double Batting_Average = Total_Runs/Number_of_Dismissals;
        System.out.println("Batting Average: " + Batting_Average);
        sc.close();
    }
}
