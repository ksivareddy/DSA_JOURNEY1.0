package Basic_Conditional_Loops;

import java.util.Scanner;

public class Volume_Of_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double Volume =(4/3)* 3.14 * Math.pow(r, 3);
        System.out.println("Volume of Sphere: " + Volume);
        sc.close();
    }
}


//17. Volume of Sphere:
// V = (4/3) * π * r^3
// The volume of a sphere is calculated by multiplying four-thirds of π (pi) with the cube of the radius (r).