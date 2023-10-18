package OOPS1.InitialiseObjects;

public class InitializeReference {
    public static void main(String[] args) {
        //Creating objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Initializing objects
        s1.id = 101;
        s1.name = "Siva";
        s2.id = 102;
        s2.name = "Venki";
        
        //Print data 
        System.out.println(s1.id + " "+ s1.name);
        System.out.println(s2.id + " "+ s2.name);
    }
}

class Student {
    int id;
    String name;
}