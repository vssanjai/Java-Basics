package Java_oops;

public class Acessmodifier {
    public String name;
    private int age;
    protected String email;
    String phoneNumber;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        Acessmodifier san = new Acessmodifier();
        san.name = "prasanna";
        san.setAge(20);// Using setter to set age and san.age = 20; // This line would cause an error because age is private
        san.email = "sanjayvs2019@gmail.com";
        san.phoneNumber = "1234567890";
        san.display();
        System.out.println("Accessed using getter: Age = " + san.getAge());
    }
}


// This class demonstrates the use of access modifiers in Java.
// It is currently empty, but you can add methods and attributes to illustrate public, private, protected, and default access levels.
// Access modifiers control the visibility of classes, methods, and variables in Java.
//// - `public`: Accessible from any other class.
// - `private`: Accessible only within the same class.
// - `protected`: Accessible within the same package and subclasses.
// - Default (no modifier): Accessible only within the same package.        
