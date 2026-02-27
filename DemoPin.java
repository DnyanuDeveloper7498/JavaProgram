
import java.util.Scanner;

class DemoPin
{
	public static void main(String [] args)
	{
	  Scanner sc = new Scanner(System.in);
	  
	  int attempt=0;
	  
	    do
	    {
			System.out.print("Eneter a Your Pin:");
			int pin = sc.nextInt();
			
		     attempt++;
			
			  if (pin==123)
			  {
				  System.out.println("You Have Login");
			  }
			   else 
			{
				   System.out.println("Not a Login");
				   
				   
			}
			
			System.out.println("Your attempt left:"+ (attempt-1));
	    }
	    while (attempt!=0);
	
	     
	
	}
	
}