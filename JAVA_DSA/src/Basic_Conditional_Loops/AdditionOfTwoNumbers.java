package Basic_Conditional_Loops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int s  = add(num1, num2);
        System.out.println("Sum: " + s);
        sc.close();
    }
    public static int add(int a , int b){
       return a + b;
    }
}
