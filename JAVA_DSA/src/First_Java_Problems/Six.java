package First_Java_Problems;

// 6 . Input currency in rupees and output in USD.
import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter the amount in Indian Rupees (INR): ");
        double inrAmount = sc.nextDouble();
        System.out.print("ExchangeRate: " + currencyConverter(inrAmount) + "$");
        sc.close();
    }
    public static double currencyConverter(double i  ){

        // Define the exchange rate (hypothetical value)
        double exchangeRate = 0.012; // 1 INR = 0.015 USD
        return i * exchangeRate ;
    }
}
