
import java.util.Scanner;

class EvenOdd 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter a Number ");
		
		int num = sc.nextInt();
		
		String output = (num%2==0)? (num +" Number is Even"):(num + "Number is Odd");
		
		System.out.println(output);
	}
}
