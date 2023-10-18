package OOPS1;

public class PassByValueExample {
    public static void main(String[] args) {
        int x = 10;
        modifyPrimitive(x);
        System.out.println("After modification: " + x);
    }

    public static void modifyPrimitive(int num) {
        num = 20;
    }
}
