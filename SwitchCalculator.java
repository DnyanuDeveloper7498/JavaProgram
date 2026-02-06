
import java.util.Scanner;

class SwitchCalculator 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter Num1 :");
		double num1 = sc.nextDouble();
		
		System.out.print("Eneter Num2:");
		double num2 = sc.nextDouble();
		
		System.out.print("Eneter Operator :");
		char oper= sc.next().charAt(0);
		
		solve(num1,num2,oper);
		
	}
	
	public static void solve (double num1 , double num2 , char oper)
	{
		
		double sum=0;
		
	
	    switch(oper)
		{
			case '+' : 
				sum = num1+num2;
			     break;
				
			 case '-' : 
				sum = num1-num2;
			     break;
				 
			 case '*' : 
				sum = num1*num2;
			     break;
				 
			case '/' : 
				sum = num1/num2;
			     break;
				 
		    case '%' : 
				sum = num1+num2;
			     break;
				
			default : System.out.println(" \n Ivalide Operator \n");
			break;
		}
		
		System.out.println( num1 +" "+ oper +" "+ num2 + " = " +sum);
		
		
	}
	
	
	
}
