
import java.util.Scanner;

class ReversMirrorNum 
{
	public static void main(String[] args) 
	{
	  Scanner sc =new Scanner(System.in);
	  
	  System.out.println("Enter a Number:");
	  int num =sc.nextInt();
	  
	   int org=num,second=0,digit=0,mul=1;
	   
	   for (int count=num;count!=0 ;count/=10 )
	   {
		   digit++;
	   }
	  for (int i=1;i<=digit/2 ;i++)
	  {
		  int last =num%10;
		 second=second*10+last;
		  
		//  second =mul*last+second;
		  
		  mul*=10;
		  num/=10;
	  }
	     
		 System.out.println(second);
	  
	  if (num==second)
	   {
		   System.out.println("This is Mirror Number");
	   }
	     else 
		{
			 System.out.println("Not a Mirror Number");
		}
	  
	}
}
