//1. Area Of Circle Java Program
package Basic_Conditional_Loops;

import java.text.DecimalFormat;
import java.util.*;
public class Area_Of_Circle {   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double r = sc.nextDouble();
      double area = areaOfCircle(r);
      DecimalFormat df = new DecimalFormat("#.##");
      double roundedNumber = Double.parseDouble(df.format(area));
      System.out.println("Area of Circle: " + roundedNumber);
      sc.close();
    }
    public static double areaOfCircle(double r ) {
    double pi = 3.14159;
    return  pi* Math.pow(r, 2);
    }
    
}


//1. Area of Circle:
// A = πr^2
// The area of a circle is calculated by multiplying π (pi) with the square of the radius (r).