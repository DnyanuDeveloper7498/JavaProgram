
import java.util.Scanner;

class CountFibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a starting num:");
		int start=sc.nextInt();
		
		System.out.println("Enter a ending num:");
		int end=sc.nextInt();
		
	      int n1=0,n2=1,ans,cnt=0;
		  
		  while (n1<=end)
		  {
			 ans =n1+n2;
			 if (n1>=start)
			 {
				cnt++;
			 }
			 
			 n1=n2;
			 n2=ans;
		  }
	    System.out.println( start+" To "+end +" Total Fibinacci:"+cnt);
	}
}
