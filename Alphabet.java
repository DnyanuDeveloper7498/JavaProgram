// check alphabet
import java.util.Scanner;

class Alphabet 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=  new Scanner(System.in);
		
	
		System.out.println("Eneter Charactor :-");
		
	    char ch = sc.next().charAt(0);
		
		   
		String op= ((ch >='A' && ch<='Z')||(ch>='a' && ch<='z'))? (ch+" Is a Alphabet "):(ch+ " Not a Alphabet ");
		   
		
		System.out.println(op);
		


		
	}
}
