
public class ConstructorDemo1 { 
	int first;
	int second;
	int third;
	
	
	public ConstructorDemo1(int a, int b, int c)
	{
		first=a;
		second=b;
		third=c;
	}
	public int addition()
	{
		int sum= first+ second+ third;
		System.out.println("The addition is = "+ sum);
		return sum;
	}
	public void display()
	{
		System.out.println("The first value is = "+ first);
		System.out.println("The first value is = "+ second);
		System.out.println("The first value is = "+ third);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo1 sc= new ConstructorDemo1(10, 20,30);
sc.addition();
sc.display();
	}

}
