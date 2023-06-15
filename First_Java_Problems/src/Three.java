// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    Float P = sc.nextFloat(); 
    Float T = sc.nextFloat();
    Float R = sc.nextFloat();
    Float SI = (P*T*R)/100;
    System.out.println("Simple Interest:" + SI);
    sc.close();

}
}
    
