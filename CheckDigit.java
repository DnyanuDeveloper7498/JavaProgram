
import java.util.Scanner;

class CheckDigit
{
	public static void main(String [] args)
	{
	  Scanner sc = new Scanner(System.in);
  
	  System.out.print("Eneter a Digit :");
	  int num = sc.nextInt();
	  
	  System.out.print("Eneter a Check Digit:");
	  int digit = sc.nextInt();
	  
	  
	  while (num!=0)
	  {
		 int last =num%10;
		 
		   if (last==digit)
		   {
			   break;
		   }
		 
		  num/=10;
	   }

           if (num>0)
           {
			   System.out.println(digit+" The number contains the digit");
           }
  	       else 
		{
			  System.out.println(digit + "The number does not contain the digit.");
		}
		
	}
	
}


