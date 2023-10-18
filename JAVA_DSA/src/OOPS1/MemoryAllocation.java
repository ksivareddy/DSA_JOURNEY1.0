package OOPS1;

public class MemoryAllocation {
    public static void main(String[] args) {
// Creating two Student objects and assigning one to the other
        Student one = new Student();
        Student two = one;
        one.name = "Something Something";

        System.out.println(two.name);
    }
}


class Student {
    int rno;
    String name;
    float marks = 96.4f;

    // Copy constructor: Initializes a Student object based on another Student object
    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // Default constructor
    Student() {
        // Call another constructor with default values
        this(13, "default person", 75.5f);
    }

    // Parameterized constructor with three parameters
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
