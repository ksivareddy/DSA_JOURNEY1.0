package First_Java_Problems;

// To find Armstrong Number between two given number.
import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println("It's an Amstrong Number");
        }
        else{
            System.out.println("Its not an Amstrong Number");
        }
        sc.close();
    }
    public static boolean isArmstrong(int num) {
           int Originalnum = num;
           int sum = 0;
           while (num > 0) {
               int numDigits = String.valueOf(Originalnum).length();
               int rem = num%10;
               num /= 10; 
               sum += Math.pow(rem, numDigits);         
           } 
           return Originalnum == sum;
    }
}