package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class Number_Palimdrome {
    public static void main(String[] args) {      
           Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("It's an Palindrome Number");
        }
        else{
            System.out.println("Its not an Palindrome Number");
        }
        sc.close();
     
    }
    public static boolean isPalindrome(int n) {
        int Originalnum = n ;
          int sum = 0;
        while (n > 0) {
           int r = n % 10;
            sum = sum * 10 + r;          
             n = n/10;
        }
        return sum == Originalnum;
    }
}
