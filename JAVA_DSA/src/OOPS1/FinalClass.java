package OOPS1;

public class FinalClass {
public static void main(String[] args) {

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
    //    kunal = new A("new object"); // error 

        System.out.println(kunal);

    }

}

class A {
    final int num = 10;
    String name;
    public A(String name) {
        this.name = name;
    }
}