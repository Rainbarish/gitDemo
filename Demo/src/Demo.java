import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number to check if that is positive or negtive = ");
int digit= sc.nextInt();
if (digit>=0)
{
	System.out.println("The number is positive");
}
else
{
	System.out.println("The number is negative");
}

	}

}
