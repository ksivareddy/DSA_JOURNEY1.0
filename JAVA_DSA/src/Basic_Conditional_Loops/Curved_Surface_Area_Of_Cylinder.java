package Basic_Conditional_Loops;

import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double height = sc.nextDouble();
        double CSA = 2*3.14 * R* height;
        System.out.println("Curved Surface Area of Cylinder: " + CSA);
        sc.close();
    }
}




//19. Curved Surface Area of Cylinder:
// CSA = 2πrh
// The curved surface area of a cylinder is calculated by multiplying the product of 2π (pi) with the radius (r) and height (h).