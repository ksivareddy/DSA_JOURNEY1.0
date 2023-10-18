package OOPS1.InitialiseObjects;

public class InitializeMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.insertRecord(111, "Sravs");
        s2.insertRecord(112, "Nikhitha");
        s1.displayInformation();
        s2.displayInformation();
    }
}


class Student {
   int rollno;
   String name;

   void insertRecord (int r, String n){
    rollno = r;
    name = n;
   }
   void displayInformation(){
    System.out.println(rollno + " " + name);
   }
}



//Object and Class Example: Initialization through method