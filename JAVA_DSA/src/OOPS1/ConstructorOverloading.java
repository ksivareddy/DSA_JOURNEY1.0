package OOPS1;

public class ConstructorOverloading {
    
    public static void main(String[] args) {

        // Creating a Student object using the constructor with parameters
        Student siva = new Student(23, "Siva K", 95.4f);
        System.out.println(siva.rno);
        System.out.println(siva.name);
        System.out.println(siva.marks);

        // Creating a Student object using the default constructor
        Student random = new Student();
        // Output the values of the random object's fields
        System.out.println(random.rno);    // Output: 20 (default value)
        System.out.println(random.name);   // Output: "Siva R Reddy" (default value)
        System.out.println(random.marks);  // Output: 90.0 (default value)
    
        // Output the values of the random other studen
        System.out.println(random.name);   
    } 
}
class Student {
    int rno;
    String name;
    float marks = 96.4f;

   Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // Default constructor (no parameters)
    Student (){
        this.rno = 20;
        this.name = "Siva R Reddy";
        this.marks = 89;
    }

    // Parameterized constructor with three parameters
    Student (int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}