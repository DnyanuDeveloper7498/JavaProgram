
import java.util.Scanner;

class TableFor 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Eneter a Number:");
	   
	   int num =sc.nextInt();
	   
	   for (int table=1;table<=10 ;table++ )
	   {
		   System.out.println(table + " * " +num +" = "+(table*num));
	   }
	}
}
