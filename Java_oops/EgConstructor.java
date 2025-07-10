// Class name should start with a capital letter by Java convention
class Maths {
    long n1;
    long n2;

    // Default constructor
    Maths() {
        this.n1 = 23;
        this.n2 = 43;
        System.out.println("Sum (default constructor): " + (n1 + n2));
    }

    // Parameterized constructor
    Maths(long n1, long n2) {
        this.n1 = n1;
        this.n2 = n2;
        System.out.println("Difference (parameterized constructor): " + (n2 - n1));
    }
}

// Main class and method
public class EgConstructor {
    public static void main(String[] args) {
        // Calls parameterized constructor
        Maths a = new Maths(1, 3);  // Outputs: Difference: 33
        Maths b = new Maths(1,3);       // Outputs: Sum: 0

        Maths c= new Maths();
    }
}
