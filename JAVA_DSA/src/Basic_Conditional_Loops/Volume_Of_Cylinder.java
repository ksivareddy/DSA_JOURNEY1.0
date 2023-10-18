package Basic_Conditional_Loops;

import java.util.Scanner;

public class Volume_Of_Cylinder {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double Volume = 3.14*Math.pow(r, 2)*h;
        System.out.println("Volume of Cylinder: " + Volume);
        sc.close();
    }
}

//16. Volume of Cylinder:
// V = π * r^2 * h
// The volume of a cylinder is calculated by multiplying the base area (πr^2) with the height (h).