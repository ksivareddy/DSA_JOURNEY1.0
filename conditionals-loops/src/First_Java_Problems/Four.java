// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;
public class Four {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int n1 = sc.nextInt(); 
    int n2 = sc.nextInt();
    String s  = sc.next();
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
    
    sc.close(); 
    }
}
