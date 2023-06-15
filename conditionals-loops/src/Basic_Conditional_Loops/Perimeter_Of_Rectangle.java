package Basic_Conditional_Loops;

import java.util.Scanner;

public class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double Perimeter = 2 * (l + b);
        System.out.println("Perimeter of Rectangle: " + Perimeter);
        sc.close();
    }
}




//11. Perimeter of Rectangle:
// P = 2 * (length + width)
// The perimeter of a rectangle is calculated by adding twice the length and twice the width of the rectangle.