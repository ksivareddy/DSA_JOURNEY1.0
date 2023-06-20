package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (isVowel(ch)) {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + "is a consonant.");
        }
        sc.close();
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u';
    }
}
