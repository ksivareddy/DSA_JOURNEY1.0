package Intermediate_Conditional_Loops;
import java.util.Scanner;
/**
 * Discount_Of_Product
 */
public class Discount_Of_Product {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double OriginalBill = sc.nextDouble();
        double Discount = sc.nextDouble();
        double finalBill =  OriginalBill - (OriginalBill*(Discount/100));
        System.out.println("Discounted Bill: " + finalBill);
        sc.close();
    }
}


// Discounted price = Original price - (Original price * Discount percentage)

// Using the example, the calculation would be:

// Discounted price = $100 - ($100 * 0.20) = $100 - $20 = $80

// So, with a 20% discount, the final price of the product would be $80.