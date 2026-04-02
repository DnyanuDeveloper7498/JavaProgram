
import java.util.Scanner;

class PowerFind 
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Base Number:");
		 double base =sc.nextInt();
		
		System.out.println("Enter Raise Number:");
		 double raise=sc.nextInt();
		
		power(base,raise);// method call 
			
	}
	
	public static void power(double base , double raise)
	{
		if (raise<0)
		{
			raise*=-1;
			base=1/base;
		}
		
	    double powerOf=1;
		
		for (int i=1;i<=raise;i++ )
		{
			powerOf*=base;
		}
			System.out.println(powerOf);
	}
}
