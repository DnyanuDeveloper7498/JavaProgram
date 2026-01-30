//Q WAPTD Check Palindrome Number 

import java.util.Scanner;
class CheckPalindrome
{
	public static void main(String[] args) 
	{
	   
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.println("Eneter Any Digits:- ");
	   
	   int num=sc.nextInt();
	   
	   int rem=0,temp=0,rev=0;
	   
          temp=num;   
	   
	   while (num!=0)
	   {
		   rem=num%10;
		   rev=rev*10+rem;
		   num=num/10;   
	   }
	    if (temp==rev)
	    {
			System.out.println("Number is Palindrome");
	    }
		 else 
		{
			System.out.println("Number is Not a Palindrome");
		}
	   
	}
}
