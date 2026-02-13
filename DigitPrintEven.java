
import java.util.Scanner;

class NumberPrintEven 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Eneter a Digit:");
	    int num= sc.nextInt();
	    
		int last;
		
		while (num>0)
		{
			last=num%10;
			
			if (last%2==0)
			{
				System.out.println(last);
			}
			
	      num/=10;
		}		
		
	}
}
