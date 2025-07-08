class sample {
    String name;
    int rollno;
    long phoneNumber;

    sample(String name, int rollno, long phoneNumber ){
        this.name=name;
        this.rollno=rollno;
        this.phoneNumber=phoneNumber;
    }
}

public class Studentconstructor{
    public static void main(String[] args)
    {
        //need to create instance object 
        sample hello =new sample("sanjay",34,93848339676l);
        System.out.println(hello.name);
        System.out.println(hello.rollno);
        System.out.println(hello.phoneNumber);



    }
    
}
