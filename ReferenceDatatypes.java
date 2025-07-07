import java.util.Date;
import java.awt.Point;
public class ReferenceDatatypes {
    public static void main(String[] args) {
       
       //reference data types
       
        Date a=new Date();
        System.out.println(a);
        
        // Primitive Data Types     
        // Primitive data types are used to store simple values
        // Primitive data types are predefined by the programming language
        // Primitive data types are stored in stack memory

        int b=5;
        int c=b;
        b=10;
        System.out.println(b);
        System.out.println(c); 

        
        // Reference Data Types
        // Reference data types are used to store the reference of an object
        // Reference data types are used to store the address of an object in memory
        // Reference data types are used to store the reference of an object in heap memory
        // Reference data types are stored in heap memory
  
        Point p1=new Point(10,20);
        Point p2=p1;  
        System.out.println(p2);  
        p1.x=30;
        System.out.println(p1);
        System.out.println(p2);   

        
    }

    
    
}
