
import java.util.Scanner;

class AbsMethod  
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Eneter a any number:");
		
		int num = sc.nextInt();
		
		int result = (num<=0 )? (-num) : (num);
		
		System.out.println(result);
	}
}
