package Basic_Conditional_Loops;

import java.util.Scanner;

public class Perimeter_of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double Perimeter_of_Equilateral_Triangle = 3* a;
        System.out.println("Perimeter of Equilateral Triangle:"  + Perimeter_of_Equilateral_Triangle);
        sc.close();
    }
}

//9. Perimeter of Equilateral Triangle:
// P = 3 * side
// The perimeter of an equilateral triangle is calculated by multiplying the side length by 3.