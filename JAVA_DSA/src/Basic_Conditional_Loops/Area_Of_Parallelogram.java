package Basic_Conditional_Loops;

import java.util.Scanner;

public class Area_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double Area_Of_Parallelogram = (b * h);
        System.out.println("Area of Paralellogram: " + Area_Of_Parallelogram);
        sc.close();
    }
}


//5. Area of Parallelogram:
// A = base * height
// The area of a parallelogram is calculated by multiplying the base with the height.