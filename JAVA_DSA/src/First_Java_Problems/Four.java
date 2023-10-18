package First_Java_Problems;

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class Four {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int m = sc.nextInt(); 
    int n = sc.nextInt();
    String o  = sc.next();
    Calculator(m, n, o);
    sc.close(); 
    }
    public static void Calculator(int n1 , int n2, String s ){
 if ("+".equals(s)){
        System.out.println( n1 + n2);
    } else if ("-".equals(s)){
        System.out.println( n1 - n2);
    }else if ("*".equals(s)){
        System.out.println( n1 * n2);
    }else if ("/".equals(s)){
        
        if (n2 != 0) {
            System.out.println( n1 / n2);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            System.exit(0);
        }
    }else {
        System.out.println("Error: Invalid operator.");
        System.exit(0);
    }
    
    }
}
