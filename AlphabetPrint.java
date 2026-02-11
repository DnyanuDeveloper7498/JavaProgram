// print Alphabet Print using While loop

class AlphabetPrint  
{
	public static void main(String[] args) 
	{
		char ch ='A';
		char ch2='a';
		
		while (ch<='Z' && ch2 <='z')
		{
				System.out.printf("%n %s ",ch);
			    System.out.printf(" %s ",ch2);
			  ch++;
			  ch2++;
		}
		
		
	
	}
}
