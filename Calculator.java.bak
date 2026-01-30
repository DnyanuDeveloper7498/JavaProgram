
import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num1:");
		
		double num1=sc.nextDouble();
		
		
		System.out.print("Enter a Operator :");
		
		char op =sc.next().charAt(0);
		
		System.out.print("Enter a num2:");
		
		double num2 = sc.nextDouble();
		
	  double result = ((op=='+')?(num1+num2):
		               (op=='-')?(num1-num2):
		                (op=='*')?(num1*num2):
		                (op=='/')?(num1/num2):
		                (op=='%')?(num1%num2):(Double.MAX_VALUE));
	  
	       if (result!=Double.MAX_VALUE)
	       {
			 		 System.out.println(num1 + " "+ op + " "+num2 + "  "+ result );	
	       }
		    else 
		{
			 System.out.println("Invalide operator ");
	      }
	}
}
