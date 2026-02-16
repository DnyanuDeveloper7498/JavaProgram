
import java.util.Scanner;

class CheckProduct
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Numbers :");
		int num=sc.nextInt();
		int sum=0 ,product=1;
		
		while (num>0)
		{
			int last=num%10;
			sum=sum+last;
			product= product*last;
			num/=10;
		}
		
		  if (sum==product)
		  {
			  
			  System.out.println("Sum and Product of Numbers are Same");

		  }
		   else 
		{
			System.out.println("Sum and Product of Numbers are Not Same");

		}
	
	}
}
