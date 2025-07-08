// First class (non-public)
class Constructor {
    String studentname;
    int age;
    int rollno;
    // Constructor to initialize the attributes
    Constructor(String name, int age, int rollno){
        this.studentname=name;
        this.age=age;
        this.rollno=rollno;
    }

    }


// Second class (must be public and match filename)
public class SampleConstructor {
    public static void main(String[] args) {
        Constructor student = new Constructor("John", 20, 101);
        System.out.println("Name: " + student.studentname);
        System.out.println("Age: " + student.age);
        System.out.println("Roll No: " + student.rollno);
    }
}

