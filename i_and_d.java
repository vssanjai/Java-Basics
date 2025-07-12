
public class i_and_d{
    public static void main(String[] args){
        
        // Increment pre and post and how its work 
        int a=10;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(++a + a++);//13+13 because a=12
        System.out.println(a++ + ++a);// a=14 14+16=30

        //
        int b=10;
        int c=10;

        System.out.println(++b + b++);//11+11
        System.out.println(c++ + ++c);//10+12


        //Decrement pre and post and how its work 

        int d=10;
        System.out.println(--d);//9
        System.out.println(d--);//9
        System.out.println(--d + d--);//7+7=14 because d=8
        System.out.println(d-- + --d);// 6 +4 =10 d=7

        int h=10;
        int e=10;

        System.out.println(--h + h--);//9+9
        System.out.println(e-- + --e);//10+8



        
    }

}