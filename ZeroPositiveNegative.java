
 import  java.util.Scanner;

class ZeroPositiveNegative 
{
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter a Number:");
		
		int num = sc.nextInt();
		
		String output = (num >0)?(num + "Positive Number"): ((num< 0 )? ( num +"Negative Number") :(num +"Zero"));
		
		
		System.out.println(output);
	}
}
