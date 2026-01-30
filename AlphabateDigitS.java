
import java.util.Scanner;

class AlphabateDigitS 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter a Char ");
		
		char ch = sc.next().charAt(0);
		
		String output = (ch>='A'&& ch<='Z' || ch>='a' && ch<='z')?
			            
		                (ch + " char is Alphabet "):
			          
		                ((ch>='0' && ch<='9')? (ch + "is a Digit") : (ch + "This character is NOT an Alphabet and NOT a Digit") );
		
		
		
		System.out.println(output);
	}
}
