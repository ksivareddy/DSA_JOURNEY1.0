//5. Take 2 numbers as input and print the largest number.
import java.util.*;
public class Five {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if (a > b) {
        System.out.println("Largest Number is " + a);
    } else {
        System.out.println("Largest Number is " + b);
    }
    sc.close();;
   } 
}
