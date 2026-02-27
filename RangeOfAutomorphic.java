
import java.util.Scanner;
class RangeOfAutomorphic 
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
			int num=start;
			int sq=num*num;
			
			int tempNum=num;
			int tempsq=sq;
			
			  while (tempNum!=0)
			  {
				  
				  if (tempNum%10 != tempsq%10)
				  {
					  break;
				  }
				  
				  tempNum/=10;
				  tempsq/=10;    
			  }	 
				 if (tempNum==0)
				 {
					 System.out.println(num);
				 }
			
			start++;
			
		}	
	}
}
