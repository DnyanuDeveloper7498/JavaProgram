
import java.util.Scanner;
class TaxSalary
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter a Salary:");
		
		double sal = sc.nextDouble();
		
	     double tax=0, annualSal=sal *12 , totalSal=0;
		
		 String  taxPer="";
		 
		
		 if (annualSal>=400000 && annualSal<=800000)
		{
			
			tax= annualSal*5/100; 
			
			totalSal=tax+annualSal;
			taxPer ="5%";
		}
		else if(annualSal >=800000 && annualSal<=1200000)
			{
			
			tax=annualSal*10/100; 
			
			totalSal=tax+annualSal;
			
			taxPer ="10%";
		}
		else if ( annualSal>=1200000  && annualSal<=1600000)
		{
			
			tax= annualSal*15/100; 
			
			totalSal=annualSal;
			taxPer ="15%";
		}
		else if (annualSal >=1600000 && annualSal <=2000000)
		{
			
			tax= annualSal*20/100; 
			
			totalSal=tax+annualSal;
			taxPer ="20%";
		}
		 else if (annualSal >=2000000 && annualSal<=2400000)
		 {
			 
			tax=annualSal*25/100; 
			
			totalSal=tax+annualSal;
			taxPer ="25%";
		 }
		  else if(annualSal >=2400000)
		{
			tax=annualSal*30/100; 
			totalSal=tax+annualSal; 
			taxPer ="30%";
		}
		 else
		{
			 System.out.println("Your Income Tax Payable is ₹0");
			 return;
		}
		
		
		    System.out.println("Your Annual Sal:"+ annualSal);
			System.out.println("Your "+ taxPer +" Tax :"+tax);
			System.out.println("Your Salary With Tax :"+totalSal);
			
	}
}
