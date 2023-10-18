package OOPS1.InitialiseObjects;

public class InitializeTruConstructor {
 public static void main(String[] args) {
       Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

    s1.insertr(11, "Harshitha", 98f);
    s2.insertr(12, "Siva", 75f);
    s3.insertr(13, "Bhavya", 85f);
    s1.display();
    s2.display();
    s3.display();
 }
}


class Student {
    int id ;
    String name;
    float marks;
    void insertr (int i, String n, float s){
        id = i;
        name =n;
        marks = s;
    }
    void display(){
        System.out.println(id + " "+name+ " "+ marks);
    }
}