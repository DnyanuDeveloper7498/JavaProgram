
import java.util.Scanner;

class PositiveNegative 
{
	public static void main(String[] args) 
	{
	     Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Eneter Any Number:");
		 
	    	int num = sc.nextInt();
		
		String output = (num >0)? (num + " is Positive Number"):(num + "Negative Number" );
		
		System.out.println(output);
	}
}
