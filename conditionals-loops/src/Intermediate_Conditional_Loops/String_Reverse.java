package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int length = n.length();
        String rev = "";
        for (int i = length -1;i >= 0;  i--) {
            rev += n.charAt(i);

        } 
        System.out.println(rev);
        sc.close();   
    }
}
