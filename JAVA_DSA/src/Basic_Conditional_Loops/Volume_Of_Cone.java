package Basic_Conditional_Loops;

import java.util.Scanner;

public class Volume_Of_Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double Volume = (1.0 / 3) * 3.14 * Math.pow(r, 2) * h;
        System.out.println("Volume of Cone: " + Volume);
        sc.close();
    }
}

//14. Volume of Cone:
// V = (1/3) * π * r^2 * h
// The volume of a cone is calculated by multiplying one-third of the base area
// (πr^2) with the height (h).