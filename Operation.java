public class Operation {
    public static void main(String[] args) {
        int a=10;
        int b=4;
        
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        
        int difference = b - a;
        System.out.println("The difference when " + b + " is subtracted from " + a + " is: " + difference);
        
        int product = a * b;
        System.out.println("The product of " + a + " and " + b + " is: " + product);
        
        int quotient = a/ b;
        System.out.println("The quotient when " + b + " is divided by " + a + " is: " + quotient);
        
        int remainder = b % a;
        System.out.println("The remainder when " + b + " is divided by " + a + " is: " + remainder);
       
        float f=a/b;
        System.out.println("The float value of a/b is: " + f);

        int c=10;
        int d=4;
        float n=(float)c/(float)d;
        System.out.println("The float value of c/d is: " + n);

        int incrementedA = ++a;
        System.out.println("The value of a after incrementing is: " + incrementedA); //pre-increment
       
        int decrementedB = --a;
        System.out.println("The value of b after decrementing is: " + decrementedB);

        System.out.println(a++); //post-increment
        System.out.println(a);

    
       
        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual);
       
        boolean isNotEqual = (a != b);
        System.out.println("Is a not equal to b? " + isNotEqual);
       
        boolean isGreater = (a > b);
        System.out.println("Is a greater than b? " + isGreater);
       
        boolean isLess = (a < b);
        System.out.println("Is a less than b? " + isLess);
       
        boolean isGreaterOrEqual = (a >= b);
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);
       
        boolean isLessOrEqual = (a <= b);
        System.out.println("Is a less than or equal to b? " + isLessOrEqual);
       
        boolean logicalAnd = (a < b) && (b > 5);
        System.out.println("Is a less than b AND b greater than 5? " + logicalAnd);
       
        boolean logicalOr = (a < b) || (b < 5);
        System.out.println("Is a less than b OR b less than 5? " + logicalOr);
        
        boolean logicalNot = !(a < b);
        System.out.println("Is it NOT true that a is less than b? " + logicalNot);
    }
    
}
