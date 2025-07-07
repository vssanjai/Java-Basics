public class Methods {
    public static void main(String[] args) {
        int res = add(15, 15);  
        res = res * 10;        
        System.out.println(res);      
        System.out.println("a is printed"); 
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}

// Step 1: Call the add() method with arguments 15 and 15
// Step 1.1: Inside add(), compute a + b = 15 + 15 = 30
// Step 1.2: Return 30 to the caller and store it in 'res'
// Step 2: Multiply res by 10 → res = 30 * 10 = 300
// Step 3: Print the result → Output: 300
// Step 4: Print the message → Output: a is printed


// This program demonstrates method calling and parameter passing in Java.
// The add method takes two integers as parameters, computes their sum, and returns the result.
// The main method calls the add method with specific values, processes the result, and prints it//
// mostly used in Java programs to encapsulate functionality and promote code reuse.


