
import java.util.Scanner;


class RangeFibonacci 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  
	   System.out.print("Entre Starting :");
	   int start= sc.nextInt();
	   
	    System.out.print("Enter ending :");
		int end = sc.nextInt();
		
		int n1=0,n2=1,ans;
		
	     while(n1<end)
		{
			 ans=n1+n2;
			 
			 if (n1>start)
			 {
			    System.out.println(n1);
			
			 }
			    n1=n2;
			    n2=ans;	
		}
	}
}
