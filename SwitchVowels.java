
import java.util.Scanner;


class SwitchVowels 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Char:");
		
		char ch = sc.next().toLowerCase().charAt(0);
		
		switch(ch)
		{
			case 'a','e','i','o','u': 
				System.out.println(ch + "char is vowel"); break;
			
		default :
			System.out.println(ch + " Char is Not a Vowel");
			
		}
		
		
		
		
	}
}
