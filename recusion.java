public class recusion {
        public static void main(String[] args) {
            int natprint=10; // Change this value to print natural numbers up to n
            natprint(natprint);
       
    }
        public static void natprint(int n){
            if(n==1){
                System.out.println(n);
            }
            else{
                natprint(n-1);
                System.out.println(n);
            }

        }
    
}
