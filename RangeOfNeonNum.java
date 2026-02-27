
import java.util.Scanner;

class RangeOfNeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Start :");
		int start=sc.nextInt();
		
		System.out.println("Enter a end :");
		int end=sc.nextInt();
		
		
		while (start<=end)
		{
			
			int sq=start*start;
			int sumSq=0;
			
			
			while (sq!=0)
			{
			   int last =sq%10;
			   sumSq=sumSq+last;
			   sq/=10;
			}
			
			if(start==sumSq)
			{
			   System.out.println(start);
			}
			
			start++;
			
		}
		
	}
}
