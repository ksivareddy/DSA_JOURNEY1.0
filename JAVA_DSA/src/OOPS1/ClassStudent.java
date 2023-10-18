package OOPS1;

public class ClassStudent {
    public static void main(String[] args) {
        // store 5 roll nos
        //int[]  numbers = new int[5];
        // store 5 names
        //String[] names = new String[5];

        // data 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        Student siva = new Student();

        System.out.println(siva.rno);
    } 
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;
}