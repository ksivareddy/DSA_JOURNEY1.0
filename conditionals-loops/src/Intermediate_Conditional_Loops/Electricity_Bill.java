package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();
        double consumtion = sc.nextDouble();
        double bill = consumtion * rate;
        System.out.println("Electricity Bill: " + bill);
        sc.close();
    }
}
