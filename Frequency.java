
 import java.util.Scanner;
class Frequency 
{
	public static void main(String[]args)
	{
		System.out.println("Enter a Number:");
		int num=new Scanner(System.in).nextInt();

		frequency(num);

         
	}

	public static void frequency(int num)
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

                if(ct>0)
                {
                   System.out.println(i+"-->"+ct);
                }
            
		}
	} 
}