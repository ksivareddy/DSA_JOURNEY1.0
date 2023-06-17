package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the points: " + distance);
        sc.close();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }
}

// Calculate Distance Between Two Points
// Distance = √((x2 - x1)² + (y2 - y1)²)