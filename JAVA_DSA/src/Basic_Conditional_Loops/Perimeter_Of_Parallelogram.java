package Basic_Conditional_Loops;

import java.util.Scanner;

public class Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double Perimeter = 2 * (l + w);
        System.out.println("Perimeter of Paralellogram: " + Perimeter);
        sc.close();
    }
}


//10. Perimeter of Parallelogram:
// P = 2 * (length + width)
// The perimeter of a parallelogram is calculated by adding twice the length and twice the width of the parallelogram.