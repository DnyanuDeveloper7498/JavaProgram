
import java.util.Scanner;

class EvenCount  
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Eneter a Digit :");
		int digit = sc.nextInt();
		int even;
		int count=0;
		
		while (digit>0)
		{
		   even=digit%10;
		   
		   if (even%2==0)
		   {
			   count++;
		   }
		   
		   digit/=10;
			
		}
		
		System.out.println("Total Even number in Digit:"+count);
			
	}
}
