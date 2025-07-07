public class Nestedif {
    public static void main(String[] args) {
        String a = "present";
        int t=60;
        if(a=="present"){
            System.out.println("Hi");
            if(t>=50) // above 50 it will print eligible
            {
                System.out.println("Eligibe");
            }
            
        }

        else if (a=="o") {
            System.out.println("od");
            
        }

        else if (a=="l") {
            System.out.println("late");

            
        }
        else{
            System.out.println("abasrnt");
        }

    }
}
