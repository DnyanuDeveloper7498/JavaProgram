// WAPTD Check Amstrong Number 

import java.util.Scanner;

class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		int num,rem,arm=0,orgNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Check Armstrng Number:-");
		 
		  num=sc.nextInt();
		  orgNum=num;
		 
		 while (num!=0)
		 {
			 
			 rem=num%10;
			 arm=arm+rem*rem*rem;
			 num/=10;
		 }
		   if (orgNum==arm)
		   {
			   System.out.println("Yes Amstrong Number");
		   }
		     else 
		{
			System.out.println("Not Amstrong Number");
		}
	    	
		
	}
}
