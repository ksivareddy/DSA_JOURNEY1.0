package First_Java_Problems;

// To find Armstrong Numbers in a given range.
public class NineP2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {

            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }  
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
