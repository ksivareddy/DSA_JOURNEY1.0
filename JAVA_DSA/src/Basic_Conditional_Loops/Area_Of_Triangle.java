package Basic_Conditional_Loops;

import java.util.Scanner;
public class Area_Of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double Area_Of_Triangle = 1.0 / 2 * (b * h);
        System.out.println("Area of Triangle: " + Area_Of_Triangle);
        sc.close();
    }
}


//2. Area of Triangle:
// A = (1/2) * base * height
// The area of a triangle is calculated by multiplying half of the base with the height.