// 8. To find out whether the given String is Palindrome or not.
import java.util.*;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int length = n.length();
        String rev = "";
       for (int i = length -1 ; i >=0; i--) {
        rev += n.charAt(i);
        // System.out.println(i + " "+ rev);
       }
    //    System.out.println(n == rev ? true : false);    
       System.out.println(n.equals(rev) ? true : false); 
       sc.close();   
    }
}










// public class Eight {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = 0;
//         while (n > 0) {
//              int rem = n%10;
//              System.out.println("rem -" + rem);
//              n /= 10;
//              System.out.println("n/10 -" + n);
//              ans = ans * 10 + rem;
//              System.out.println("ans -" + ans);
//         }

//     }