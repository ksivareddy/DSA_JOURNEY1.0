package First_Java_Problems;
// 1. Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class One {
         public static void isEven(int n) {
      if (n%2==0) {
         System.out.println("number is even"); 
      } else {
         System.out.println("number is odd"); 
      }
   } 
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt(); 
      isEven(n);
      sc.close();

   } 
}
