import java.util.Scanner;

class RangeOfReversNum 
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
			     int num=start;
					int rev =0;
			while(num!=0)
			{
				int last=num%10;
				rev=rev*10+last;
				num/=10;
				
			}
			
			System.out.println(rev);	
			start++;
			
		}
		
		
	}
}
