package Java_oops;
class Appform {
    String name;
    int age;
    String email;   
    int phoneNumber;

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
        System.out.println(phoneNumber);

    }

    public static void main(String[] args){
        Appform san = new Appform(); // Create an instance of Appform
        san.name="sanjay.v.s";
        san.age=20;
        san.email="sanjayvs2019@gmail.com";
        san.phoneNumber=1234567890;
        san.display();
    }
    
    
}

// This code defines a class Appform with attributes for name, age, email, and phone number.
// It includes a method to display these attributes and a main method that creates an instance of Appform,
// sets its attributes, and calls the display method to print them out. The output will show
// the values of the attributes for the created instance.