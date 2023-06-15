package Basic_Conditional_Loops;

import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double Area_Of_Equilateral_Triangle = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.println("Area Of Equilateral Triangle: " + Area_Of_Equilateral_Triangle);
        sc.close();
    }
}


//7. Area of Equilateral Triangle:
// A = (sqrt(3) / 4) * side^2
// The area of an equilateral triangle is calculated by multiplying the square of the side length with the square root of 3 divided by 4.