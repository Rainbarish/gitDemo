import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number= ");
int a= sc.nextInt();
System.out.print("Enter the second number= ");
int b=sc.nextInt();
System.out.print("Enter the third number= ");
int c=sc.nextInt();
if (a>b && a>c)
{
	System.out.println("The first number is greater"+ a);
}
else if(b>a && b>c)
{
	System.out.println("The second number is greater"+ b);
}
else if(c>a && c>b)
{
	System.out.println("The third number is greater"+ c);
}


}
}
