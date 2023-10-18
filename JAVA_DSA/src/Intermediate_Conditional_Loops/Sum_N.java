package Intermediate_Conditional_Loops;
import java.util.Scanner;
public class Sum_N {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int N = sc.nextInt();
    int Sum = (N*(N+1))/2;
    System.out.println( " Sum Of N Numbers: "+Sum);
    sc.close();
  }
}
