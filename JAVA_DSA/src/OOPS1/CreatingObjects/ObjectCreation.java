package OOPS1.CreatingObjects;

public class ObjectCreation {
public static void main(String[] args) {
  // create objects using different methods:

// 1. By new keyword (using a constructor)
    Student s1 = new Student(11, "Harshitha ", 98f);


// 2. By newInstance() method (for classes with a no-argument constructor)
try {
    Student s2 = Student.class.newInstance();
// Note: This approach requires a no-argument constructor in the class.
} catch (InstantiationException | IllegalAccessException e) {
    // TODO: handle exception
    e.printStackTrace();
} 


// 3. By clone() method (assuming a class implements Clonable)

Student originalStudent = new Student(12, "Siva", 75f);
Student s3 = null;

try {
      s3 =  (Student) originalStudent.clone();

} catch (CloneNotSupportedException e) {
    e.printStackTrace();
}
// 4. By deserialization (requires serialization and deserialization)
// Assume you have a serialized Student pbject in a file "student.ser"

// Student s4 = null;
// try (FileInputStream fileIn = new FileInputStream("student.ser");
// ObjectInputStream in = new ObjectInputStream(fileIn)) {
// s4 = (Student) in.readObject();
// } catch (IOException | ClassNotFoundException e) {
// e.printStackTrace();
// }

// 5. By factory method (a static method in the class)
Student s5 = Student.createStudent(13, "Bhavya", 85f);

      // Display information for each student
      s1.display();
      // s2.display(); // Commented out due to newInstance() limitation
      s3.display();
      // s4.display(); // Commented out due to deserialization requirement
      s5.display();

}    
}


class Student implements Cloneable {
    int id;
    String name;
    float marks;
    Student (int i , String n, float s){
        id = i;
        name = n;
        marks = s;
    }
    // Factory method for creating a Student object
    public static Student createStudent(int id, String name, float marks) {
        return new Student(id, name, marks);
    }

    void display(){
        System.out.println(id + " " + name + " " + marks);
    }
  @Override
  public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
