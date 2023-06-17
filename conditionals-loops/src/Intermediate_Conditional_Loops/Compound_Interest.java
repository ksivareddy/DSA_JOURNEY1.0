package Intermediate_Conditional_Loops;

import java.util.Scanner;
public class Compound_Interest {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the principal amount: ");
      double principalAmount = sc.nextDouble();

      System.out.print("Enter the annual interest rate (in decimal form): ");
      double interestRate = sc.nextDouble();

      System.out.print("Enter the number of times interest is compounded per year: ");
      int compoundFrequency = sc.nextInt();

      System.out.print("Enter the number of years: ");
      int years = sc.nextInt();

      double compoundInterest = principalAmount
            * Math.pow(1 + interestRate / compoundFrequency, compoundFrequency * years);
      System.out.println("Compound Interest: " + compoundInterest);

      sc.close();
   }
}

// The formula for calculating compound interest is:

// A = P(1 + r/n)^(nt)

// Where:

// A represents the future value of the investment/loan, including interest.
// P is the principal amount (the initial investment/loan amount).
// r is the annual interest rate (expressed as a decimal).
// n is the number of times the interest is compounded per year.
// t is the number of years.
// Using this formula, you can calculate the future value of an investment or
// the amount owed on a loan after a certain period.