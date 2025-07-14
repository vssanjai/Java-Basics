
class Math

{
	void display()
	{
		System.out.println("i loave maths");
	}
	
	void display(int a, int b) 
	{
        System.out.println("I love maths: " + (a + b));
		
	}
	
}


public class methodoverloading_poly {

	public static void main(String[] args) {
		
		Math x =new Math();
		x.display();
		x.display(1,2);
		
		
		

	}

}
