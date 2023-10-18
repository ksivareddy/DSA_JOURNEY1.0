package OOPS1;

public class WrapperClass {
    public static void main(String[] args) {
        // Boxing: Converting a primitive int to an Integer object
        int primitiveInt = 42;
        Integer integerObject = Integer.valueOf(primitiveInt);

        // Unboxing: Converting an Integer object back to a primitive int
        int retrievedInt = integerObject.intValue();

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Integer object: " + integerObject);
        System.out.println("Retrieved int: " + retrievedInt);

        // Autoboxing: Automatically converting primitive to wrapper
        Integer autoBoxed = 100;

        // Autounboxing: Automatically converting wrapper to primitive
        int autoUnboxed = autoBoxed;

        System.out.println("Autoboxed Integer: " + autoBoxed);
        System.out.println("Autounboxed int: " + autoUnboxed);
    }
}
