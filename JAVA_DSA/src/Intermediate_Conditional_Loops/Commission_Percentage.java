package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class Commission_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Total_Sale_Amount = sc.nextDouble();
        double Commission_Percentage = sc.nextDouble();
        double Commission_Amount = (Total_Sale_Amount * (Commission_Percentage / 100));
        System.out.println("Commission Amount: " + Commission_Amount);
        sc.close();
    }
}
