
import java.util.Scanner;

class RangeOfUglyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Start :");
		int start=sc.nextInt();
		
		System.out.println("Enter end  :");
		int end=sc.nextInt();
		
		while (start<=end)
		{
			int num=start;
			
			while (num!=1)
			{
				if (num%2==0)
				{
					num/=2;
				}
				else if(num%3==0)
				{
					num/=3;
				}
				else if (num%5==0)
				{
					num/=5;
				}
				else
				{
					break;
				}
			}
			if (num==1)
			{
				System.out.println(start);
			}
			
			
			start++;
		}
		
		
	}
}
