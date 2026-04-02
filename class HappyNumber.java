
import java.util.Scanner;

class HappyNumber
{
   public static void main(String []args)
   {
   	    System.out.println("Enter a Number");

   	    int num=new Scanner(System.in).nextInt();
        if(isHappy(num))
        {
        	System.out.println("Number is Happy");
        }
        else 
        {
           System.out.println("Number is Not Happy");
        }
   }

    public static boolean isHappy(int num)
    {
    	int sum=sumSqDigit(num);
         
         while(sum!=1 && sum!=4)
         {
         	sum=sumSqDigit(sum);
         }

         return sum==1;

     }


   public static int sumSqDigit(int num)
   {
   	  int sum=0;

   	  while(num!=0)
   	  {
   	  	int last=num%10;
   	  	sum+=(last*last);
   	  	num/=10;
   	  }
   	  return sum;
   }
}