package Basic_Conditional_Loops;

import java.util.Scanner;

public class Perimeter_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double Perimeter = 4 * (a);
        System.out.println("Perimeter of Rhombus: " + Perimeter);
        sc.close();
    }
}


//13. Perimeter of Rhombus:
// P = 4 * side
// The perimeter of a rhombus is calculated by multiplying the side length by 4.