package Basic_Conditional_Loops;

import java.util.Scanner;

public class Total_Surface_Area_Of_Cube {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double TSA = 6*Math.pow(a, 2);
        System.out.println("Curved Surface Area of Cylinder: " + TSA);
        sc.close();
    }
}


//20. Total Surface Area of Cube:
// TSA = 6 * side^2
// The total surface area of a cube is calculated by multiplying the square of the side length by 6.