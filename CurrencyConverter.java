
import java.util.Scanner;

class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		for (; ; )
		{
			
			System.out.println("\n WELECOME ");
			System.out.println("\n1.USD \n2.KWD \n3.EUR \n4.GBP \n5.AUD \n6.CHF \n7.CAD \n8.AED \n9.AOA \n10.ZAP \n11.XPF \n12.XOF \n13.XCD");
			
			System.out.println ("Eneter amount (INR) :");
			double amount = sc.nextDouble();
			
	        System.out.println("Eneter your Respons:");
			String resp = sc.next().toUpperCase();
				
	        boolean assump =true;
			
			double convertedAmount =0;
			
			
			if (resp.equals("USD"))
			{
				 convertedAmount = amount/90.21;
				 
			}
	       else if (resp.equals("KWD"))
	       {
			      convertedAmount = amount/295.13;
	       }
		   
		      else if (resp.equals("EUR"))
	       {
			      convertedAmount = amount/106.45;
	       }

		       else if (resp.equals("GBP"))
	       {
			      convertedAmount = amount/123.33;
	       }
		   
		       else if (resp.equals("AUD"))
	       {
			      convertedAmount = amount/63.32;
	       }
		   
		       else if (resp.equals("CHF"))
	       {
			      convertedAmount = amount/115.91;
	       }
		       else if (resp.equals("CAD"))
	       {
			      convertedAmount = amount/65.91;
	       }
		   
		       else if (resp.equals("AED"))
	       {
			      convertedAmount = amount/24.54;
	       }
		   
		       else if (resp.equals("AOA"))
	       {
			      convertedAmount = amount/0.10;
	       }
		   
		       else if (resp.equals("ZAR"))
	       {
			      convertedAmount = amount/5.64;
	       }
		       else if (resp.equals("XPF"))
	       {
			      convertedAmount = amount/0.89;
	       }
		   
		       else if (resp.equals("XOF"))
	       {
			      convertedAmount = amount/0.16;
	       }
		       else if (resp.equals("XCD"))
	       {
			      convertedAmount = amount/33.38;
	       }
		   
			else 
			{
				assump=false;
				System.out.println("Invalide ");
			}
			
			if (assump)
			{
				System.out.printf ("%.2f INR = %.2f %s %n",amount ,convertedAmount,resp);
			}
			
		}
		
		
		
		
	}
}
