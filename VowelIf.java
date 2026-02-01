
import java.util.Scanner;

class VowelIf 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter a char");
		
	  char ch = sc.next().charAt(0);
	
	  if (ch=='A' || ch=='a'|| ch=='E'|| ch=='e'|| ch=='I'|| ch=='i'||ch=='O'|| ch=='o' ||ch=='U'|| ch=='u')
	  {
		  
		    System.out.println(ch + " char is Vowel ");
		  
	  }
	  else
		{
			
				System.out.println( ch + "Char is Not a Vowel");
		}
		
		
	
	}
}
