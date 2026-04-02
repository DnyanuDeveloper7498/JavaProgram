import java.util.Scanner;
class Unique
{
	public static void main(String[]args)
	{
		System.out.print("Enter a number:");
		int num=new Scanner(System.in).nextInt();

       if(isUnique(num))
       {
       	System.out.println("Number is Unique");
       }
       else
       {
       	System.out.println("Number is not Unique");
       }
	}

	public static boolean isUnique(int num)
	{
	  for(int i=0;i<=9;i++)
	  {
	  	int ct=0;
	  	int temp=num;
         
         while(temp!=0)
         {
         	if(temp%10==i)
         	{
         		ct++;
         	}
         	temp/=10;
         }

         if(ct>1)
         {
         	return false;
         }
         
	  }
	  return true;

	}
}