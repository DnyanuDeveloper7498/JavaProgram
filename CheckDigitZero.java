
import java.util.Scanner;

class CheckDigitZero
{
	public static void main(String [] args)
	{
	  Scanner sc = new Scanner(System.in);
  
	  System.out.print("Eneter a Digit :");
	  int digit = sc.nextInt();
	  
	   boolean check=false;
	  int num;
	  
	  while (digit>0)
	  {
		  num=digit%10;
		 
		   if (num==0)
		   {
			   check=true;
		   }
		 
		  digit/=10;
	   }

           if (check)
           {
			   System.out.println("Digit is present Zero");
           }
  	       else 
		{
			  System.out.println("Digit is Not present Zero");
		}
		
	}
	
}


