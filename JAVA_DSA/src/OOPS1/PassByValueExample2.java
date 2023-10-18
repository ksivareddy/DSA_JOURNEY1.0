package OOPS1;

public class PassByValueExample2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        modifyStringBuilder(str);
        System.out.println("After modification: " + str);
    }

    public static void modifyStringBuilder(StringBuilder s) {
        s.append(", World!");
    }
}
