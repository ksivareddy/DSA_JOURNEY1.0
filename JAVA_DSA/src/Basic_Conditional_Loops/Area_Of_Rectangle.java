package Basic_Conditional_Loops;

import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double Area_Of_Rectangle = b * h;
        System.out.println("Area of Rectangle : " + Area_Of_Rectangle);
        sc.close();
    }
}


//3. Area of Rectangle:
// A = length * width
// The area of a rectangle is calculated by multiplying the length and width of the rectangle.