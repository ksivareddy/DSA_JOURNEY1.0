package OOPS1;

import OOPS1.Student;

public class CallConstructorAnotherConstructor {
    public static void main(String[] args) {
        // Creating a Student object using the constructor with parameters
        Student siva = new Student(23, "Siva K", 95.4f);
        System.out.println(siva.name);

        // Creating a Student object using the default constructor
        Student random = new Student(siva);
        // Output the values of the random object's fields
        System.out.println(random.name);

        // Creating a Student object using the default constructor
        Student random2 = new Student();
        System.out.println(random2.name);
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
