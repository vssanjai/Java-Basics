import java.util.Scanner;
public class oddorevev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();

        if (num %2==0)
        {
            System.out.println(num + " is an even number.");
        }
        else
        {
            System.out.println(num + " is an odd number.");
        }       
    }
    
}
