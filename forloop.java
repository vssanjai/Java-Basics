import java.util.Scanner;

public class forloop {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the element:");
        int a=sc.nextInt();
        System.out.println(a);
        sc.close();

        int sum=0;

        for(int i=1;i<=a;i++)
        {
            sum+=i;
        }
        System.out.println("Adding the a num is:"+sum);

        }   
    
}
