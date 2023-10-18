package First_Java_Problems;
// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    Float P = sc.nextFloat(); 
    Float T = sc.nextFloat();
    Float R = sc.nextFloat();
    System.out.println("Simple Interest:" + simpleIntrest(P, T, R));
    sc.close();
    }
    public static float simpleIntrest( float p, float t, float r){
        return (p* t * r)/ 100;
        }
    }

    
