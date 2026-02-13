
import java.util.Scanner;

class PinValidation 
{
	public static void main(String[] args) 
	{
	
	   Scanner sc =new Scanner(System.in);
	   
	   int attempt=0;
	   int storePin=1234;
	   
	   do
	   {
		   System.out.print("Eneter Your Pin:");
		   int pin = sc.nextInt();
		   
		   if (pin==storePin)
		   {
			   System.out.println("Login Successfully !");
		
			   break;
		   }
		   else 
		   {
			     attempt++;
			   System.out.println("Invalide pin ! Your Left Attempt: "+ (3-attempt));
			  
		   }
		   
	   }
	   while (attempt<3);
	   
	    if (attempt==3)
	    {
			System.out.println("Your Max attempt expire");
	    }
	
	
	
	}
}
