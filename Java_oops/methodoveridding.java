// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class methodoveridding {
    public static void main(String[] args) {
        Animal a = new Animal();   // Parent reference, parent object
        a.sound();                 // Output: Animal makes a sound

        Dog d = new Dog();         // Child reference, child object
        d.sound();                 // Output: Dog barks

        Animal ad = new Dog();     // Parent reference, child object (runtime polymorphism)
        ad.sound();                // Output: Dog barks
    }
}
