
import java.util.Scanner;

class DoWhileTable 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter Table Print num:");
		int num=sc.nextInt();
		
		int count=1;
		
	     do
	     {
			 System.out.println(num + " * " + count +" = "+ (num*count));
			 count++;
	     }
	     while (count<=10);
	}
}
