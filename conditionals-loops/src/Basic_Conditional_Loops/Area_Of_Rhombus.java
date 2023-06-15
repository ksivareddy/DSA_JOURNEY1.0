package Basic_Conditional_Loops;

import java.util.Scanner;

public class Area_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double Area = 0.5*(d1 * d2);
        System.out.println("Area of Rhombus: " + Area);
        sc.close();
    }
}


//6. Area of Rhombus:
// A = (1/2) * diagonal1 * diagonal2
// The area of a rhombus is calculated by multiplying half of the product of its diagonal