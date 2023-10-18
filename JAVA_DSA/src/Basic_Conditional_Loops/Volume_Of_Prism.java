package Basic_Conditional_Loops;

import java.util.Scanner;

public class Volume_Of_Prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double h = sc.nextDouble();
        double Volume = a * h;
        System.out.println("Volume of Prism: " + Volume);
        sc.close();
    }
}


//15. Volume of Prism:
// V = base area * height
// The volume of a prism is calculated by multiplying the base area with the height.