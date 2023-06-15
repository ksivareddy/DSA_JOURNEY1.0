// 6 . Input currency in rupees and output in USD.
import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the amount in Indian Rupees (INR): ");
        double inrAmount = sc.nextDouble();

        // Define the exchange rate (hypothetical value)
        double exchangeRate = 0.012; // 1 INR = 0.015 USD
        
        double UsdAmount = inrAmount * exchangeRate ;
        System.out.print("ExchangeRate: " + UsdAmount + "$");
        sc.close();

    }
}
