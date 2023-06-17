package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        int exponent = sc.nextInt();
        double result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
        sc.close();
    }

    public static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        } else if (exponent > 0) {
            double result = 1.0;
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            return result;
        } else {
            double result = 1.0;
            for (int i = 1; i <= -exponent; i++) {
                result /= base;
            }
            return result;
        }

    }
}

// Mathematically, if "a" is a non-zero number and "b" is a negative power, the
// expression "a^b" can be written as:
// a^b = 1 / (a^|b|)