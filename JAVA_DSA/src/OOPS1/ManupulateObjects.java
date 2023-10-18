package OOPS1;

public class ManupulateObjects {
    public static void main(String[] args) {
        // Student[] students = new Student[5];
        Student siva = new Student();   
        Student sravs = new Student();
        siva.rno = 27;
        siva.name = "Siva Reddy";
        siva.marks = 90.2f;

        
        siva.changeName("Sravani");
        siva.greeting();

        System.out.println(siva.rno);
        System.out.println(siva.name);
        System.out.println(siva.marks);
    } 
}

// create a class 
// for every single student

class Student {
    int rno;
    String name;
    float marks = 95;

// we need a way to add the values of the above 
// properties object by object

// we need one word to access every object

void greeting(){
    System.out.println("Hello! My name is " + this.name);
}

void changeName(String newName){
    name = newName;
}
    Student (){
        this.rno = 20;
        this.name = "Siva R Reddy";
        this.marks = 90;
    }
}