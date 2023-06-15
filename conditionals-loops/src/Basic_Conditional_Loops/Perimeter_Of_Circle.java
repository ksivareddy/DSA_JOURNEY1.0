package Basic_Conditional_Loops;

import java.util.Scanner;

public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double Perimeter_Of_Circle = 2* 3.14 * r;
        System.out.println("Perimeter of Circle:"  + Perimeter_Of_Circle);
        sc.close();
    }
}


//8. Perimeter of Circle:
// P = 2πr
// The perimeter (circumference) of a circle is calculated by multiplying 2π (pi) with the radius (r).