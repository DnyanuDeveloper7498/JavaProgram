import java.util.Scanner;

class ThreeNumLCM 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Numbers :");
		int n1 =sc.nextInt();
		
		System.out.println("Enter a Numbers :");
		int n2 =sc.nextInt();
		
		System.out.println("Enter a Numbers :");
		int n3 =sc.nextInt();
		
		
		int large = n1>n2? (n1>n3)?n1:n3 :(n2>n3)?n2:n3 ;

		
		 int i=1;
	     while (true)
	     {
			 if((large*i)%n1==0 && (large*i) %n2==0 && (large*i)%n3==0)
			 {
				 System.out.println(large*i);
				 break;
			 }
			 i++;
	     }
		
	}
}
