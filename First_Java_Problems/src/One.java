// 1. Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class One {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt(); 
      if (n%2==0) {
         System.out.println("number is even"); 
      } else {
         System.out.println("number is odd"); 
      }
      sc.close();

   } 
}
