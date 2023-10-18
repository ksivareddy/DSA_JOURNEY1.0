package Intermediate_Conditional_Loops;

import java.util.Scanner;

public class CGPA_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Total_Courses = sc.nextInt();
        int totalCredits = 0;
        double totalGradePoints = 0.0;
        for (int i = 1; i <= Total_Courses; i++) {
            System.out.println("Enter details for Course " + i + ":");
            System.out.print("   - Enter the grade points: ");
            double gradePoints = sc.nextDouble();

            System.out.print("   - Enter the credit hours: ");
            int creditHours = sc.nextInt();

            totalGradePoints += gradePoints * creditHours;
            totalCredits += creditHours;
        }
        double CGPA = totalGradePoints / totalCredits;
        System.out.println("CGPA: " + CGPA);

        sc.close();
    }
}

// Calculating the CGPA:
// Grade points obtained:
// Subject 1: 4.0 (A) * 4 (credit hours) = 16.0
// Subject 2: 3.0 (B) * 3 (credit hours) = 9.0
// Subject 3: 3.7 (A-) * 3 (credit hours) = 11.1
// Subject 4: 2.3 (C+) * 2 (credit hours) = 4.6

// Total grade points obtained = 16.0 + 9.0 + 11.1 + 4.6 = 40.7
// Total credit hours = 4 + 3 + 3 + 2 = 12

// CGPA = Total grade points obtained / Total credit hours = 40.7 / 12 ≈ 3.39

// Therefore, the CGPA in this example would be approximately 3.39 on a 4.0
// scale.