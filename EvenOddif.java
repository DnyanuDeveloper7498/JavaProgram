


import java.util.Scanner;


class EvenOddif 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Number:-");
		int num =sc.nextInt();
		
		System.out.println("Eneter a Char :-");
		
		char ch =sc.next().charAt(0);
		
		
		
	
		if (num==0)
		 { 
			 System.out.println("Plese Eneter any number");
		 } else if (num%2==0)
		{
			System.out.println(num + " num is Even");
		}
		
		else
		{
			 System.out.println(num + "Num is odd");
			
		}
		 
		 if (ch=='a'||ch=='A'|| ch=='E'||ch=='e'||  ch=='I'||ch=='i'|| ch=='O'||ch=='o'||ch=='U'||ch=='u')
		 {
			 
			 System.out.println( ch + " char is Vowel ");
		 }
		 else 
		{
			  System.out.println( ch + " char is not a Vowel"); 
		}
		
		
		
	} 
}
