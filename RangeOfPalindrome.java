import java.util.Scanner;

class RangeOfPalindrome 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter start :");
		int start= sc.nextInt();
		
		System.out.print("Enter end :");
		int end= sc.nextInt();
	
	
		while(start<=end)
		{  
			int rev =0;
			int temp=start;
			for (int i=start;i!=0;i/=10 )
			{
				int last=i%10;
				rev=rev*10+last;
			}
			
			if (temp==rev)
			{
				System.out.println(rev);
			}	
			start++;
			
		}
		
		
	}
}
