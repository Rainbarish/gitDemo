
public class ConstructorDemo {
	int a;
	int b;
	String name;
	/*public ConstructorDemo()
	{
		System.out.println(" Hi ");
	}*/
	public ConstructorDemo(String x)
	{
		name = x;
	}
	public ConstructorDemo(int n1, int n2)
	{
	a=n1;
	b=n2;
	}
	public void display()
	{
		System.out.println(" The number is = "+  a+ " "+b+ "  "+name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo sc= new ConstructorDemo(10,20); // call to constructor (constructor name should be classname)
//ConstructorDemo sc1= new ConstructorDemo();
ConstructorDemo sc2= new ConstructorDemo("Raman Sharma");  //?
sc.display();
sc2.display();
		
	}

}
