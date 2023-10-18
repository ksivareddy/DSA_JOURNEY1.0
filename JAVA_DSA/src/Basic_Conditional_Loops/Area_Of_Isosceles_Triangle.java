package Basic_Conditional_Loops;

import java.util.Scanner;

public class Area_Of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double a = sc.nextDouble();

        if (b >= 2 * a) {
            System.out.println(
                    "Invalid input. The base length must be shorter than twice the length of the equal sides.");
        } else {
            double h = Math.sqrt(Math.pow(a, 2) - (Math.pow(b, 2) / 4));
            double area_Of_Isosceles_Triangle = 0.5 * b * h;
            System.out.println("Area of Isosceles Triangle: " + area_Of_Isosceles_Triangle);

        }
        sc.close();
    }
}



//4. Area of Isosceles Triangle:
// A = (1/2) * base * height
// The area of an isosceles triangle is calculated by multiplying half of the base with the height.