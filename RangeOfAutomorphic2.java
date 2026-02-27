
import java.util.Scanner;
class RangeOfAutomorphic2 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Start :");
		int start= sc.nextInt();
		
		System.out.println("Enter a end :");
		int end= sc.nextInt();
		
		while(start<=end)
		{
			
			int sq=start*start;
			int tempNum=start;
			int tempsq=sq;
			int pos=1;
			int last=0;
			
			  while (tempNum!=0)
			  {
				  int rem = tempsq%10;
				  last =(pos*rem)+last;
				  pos*=10;
				  tempNum/=10;
				  tempsq/=10;    
			  }	 
				 if (start==last)
				 {
					 System.out.println(start);
				 }
			
			 start++;
			
		}	
	}
}
