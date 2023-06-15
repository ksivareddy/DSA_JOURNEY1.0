package Basic_Conditional_Loops;

import java.util.Scanner;

public class Volume_Of_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base_area = sc.nextDouble();
        double height = sc.nextDouble();
        double Volume = (1.0 / 3) * base_area * height;
        System.out.println("Volume of Pyramid: " + Volume);
        sc.close();
    }
}



//18. Volume of Pyramid:
// V = (1/3) * base area * height
// The volume of a pyramid is calculated by multiplying one-third of the base area with the height.