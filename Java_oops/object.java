package Java_oops;

public class object {
    String name;
    int age;
    String email;
    int phoneNumber;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber); 
    }
}

// main method in a separate class
class Main {
    public static void main(String[] args){
        object san = new object();
        san.name = "prasanna";
        san.age = 20;
        san.email = "sanjayvs2019@gmail.com";
        san.phoneNumber = 1234567890;
        san.display();

        object san2 = new object();
        san2.name = "sanjay";
        san2.age = 21;
        san2.email = "sanjayvs2020@gmail.com";
        san2.phoneNumber = 233232312;
        san2.display();
    }
}
