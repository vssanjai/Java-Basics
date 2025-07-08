 class rectangele {
    long length;
    long breath;

    rectangele()
    {
        length=0;
        breath=0;
        System.out.println("preimeter of rectangle:" + (2 * length + breath));     

    }

    rectangele(long length, long breath){
        this.length=length;
        this.breath=breath;
        System.out.println("area of rectangle:" + length*breath);     

    }
}

public class mathconstructor{
    public static void main(String[] args) {
        rectangele a = new rectangele(12,34);
        rectangele b= new rectangele(34,21);
    }
}
