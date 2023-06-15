//1. Area Of Circle Java Program
package Basic_Conditional_Loops;

import java.text.DecimalFormat;
import java.util.*;
public class Area_Of_Circle {   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double r = sc.nextDouble();
      double pi = 3.14159;
      double Area_Of_Circle = pi* Math.pow(r, 2);
      DecimalFormat df = new DecimalFormat("#.##");
      double roundedNumber = Double.parseDouble(df.format(Area_Of_Circle));
      System.out.println("Area of Circle: " + roundedNumber);
      sc.close();
    }
    
}


//1. Area of Circle:
// A = πr^2
// The area of a circle is calculated by multiplying π (pi) with the square of the radius (r).