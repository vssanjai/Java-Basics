import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        sc.close(); 

        int originalNum = num;
        int remainder;
        int result = 0;
        while (originalNum > 0) {
            remainder = originalNum % 10;
            result = result + (remainder * remainder * remainder);
            originalNum = originalNum / 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
