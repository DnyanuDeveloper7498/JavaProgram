
import java.util.Scanner;

class TwistedPrime 
{
	public static void main(String[] args) 
	{
	
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter a Numbers:");
	   int num = sc.nextInt();
	   
	   int rev=0,ctn=2;
	   
	   while (num!=0 )
	   {
		  int last =num%10;
		  rev=rev*10+last;
		  num/=10; 
		  
	   }
	     while(ctn<=rev)
		{
			 if (rev%ctn==0)
			 {
				 break;
			 }
			 ctn++;
		}
		 if (rev==ctn)
	     {
			 System.out.println("Prime Number");
	     }
		 else 
		{
			 System.out.println("Not a Prime Number");
		}
		
	}
}
