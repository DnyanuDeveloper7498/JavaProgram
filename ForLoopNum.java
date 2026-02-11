
import java.util.Scanner;

class ForLoopNum 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
		
		   System.out.print("Eneter Start Number:");
		   int start = sc.nextInt();
		   
		   System.out.print("Eneter Start Number:");
		   int end = sc.nextInt(); 
		 
		 
		 for (int num=start;num<=end ;num++ )
		 {
			 System.out.println(num);
		 }
		
	}
}
