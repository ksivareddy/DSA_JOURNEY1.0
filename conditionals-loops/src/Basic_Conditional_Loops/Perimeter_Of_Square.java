package Basic_Conditional_Loops;

import java.util.Scanner;

public class Perimeter_Of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double Perimeter = 4 * (a);
        System.out.println("Perimeter of Square: " + Perimeter);
        sc.close();
    }
}



//12. Perimeter of Square:
// P = 4 * side
// The perimeter of a square is calculated by multiplying the side length by 4.