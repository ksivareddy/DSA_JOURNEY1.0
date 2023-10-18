package First_Java_Problems;

//5. Take 2 numbers as input and print the largest number.
import java.util.*;
public class Five {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    
   isLargest(x, y);
    sc.close();;
   } 

   public static void isLargest(int a , int b){
 if (a > b) {
        System.out.println("Largest Number is " + a);
    } else {
        System.out.println("Largest Number is " + b);
    }
   }
}
