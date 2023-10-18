package OOPS1;

public class GarbageCollection {
public static void main(String[] args) {
    
        A obj = new A("Rnadvsjhv");

        System.out.println(obj);

       for (int i = 0; i < 1000000000; i++) {
           obj = new A("Random name");
       }

    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}