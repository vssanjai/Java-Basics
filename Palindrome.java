import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close(); 

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int remainder = num % 10;             // Get the last digit
            reverse = reverse * 10 + remainder;   // Add digit to reversed number
            num = num / 10;                       // Remove the last digit
        }
        if (original == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
