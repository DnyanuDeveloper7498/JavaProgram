
import java.util.Scanner;

class CheckStrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		
		if (isStrong(num))
		{
			System.out.println("Yes Strong Number");
		}
		 else
		{
			System.out.println("Not Strong Number");
		}
		
	}
	
	public static boolean isStrong(int num)
	{
		int sum=0;
		for (int i=num;i!=0;i/=10 )
		{
			int last=i%10;
			
			sum=sum+factorial(last);
		}
		return sum==num;
	}
	
	
	public static int factorial(int num)
	{
	   int fact=1;
	   while(num>1)
		{
		   fact*=num;
		   num--;
		}
	    return fact;
	}
}
