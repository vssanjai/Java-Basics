import java.util.Scanner;

public class switchcsae {
    public static void main(String[] args) {
        Scanner myobj =new Scanner(System.in);
        System.out.println("enter the element:");
        String a=myobj.nextLine();
        myobj.close();
        
        
        switch (a) {
            case "monday":
            System.out.println("Hi");
                break;

            case "tuesday":
            System.out.println("hello");
            break;

            case "wed":
            System.out.println("vanakkam");
            break;

            case "thrs":
            System.out.println("namasa");
            break;

            case "friday":
            System.out.println("un");
            break;

            case "saturday":
            System.out.println("ru");
            break;

            default:
            System.out.println("Enjoy its sunday");    

        }

        

        
    }
    
}
