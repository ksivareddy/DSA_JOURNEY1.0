// Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String n = sc.next(); 
        System.out.println("Hello!" + n + " "+ "How are you doing ?");
        sc.close();
    }
}
