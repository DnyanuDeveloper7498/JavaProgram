
/*Q2. Bank Interest

Account me ?50,000 deposit hai.
Annual interest rate 5% hai (simple interest).
 Java program likho jo 5 years ka total amount calculate kare.
*/

class BankInterest  
{
	public static void main(String[] args) 
	{
	 double balence = 50000;
	     
		
		  double interest = (balence + (balence * 5/100))- balence;
		 
		 double total= balence + (balence * 5/100)*5;
		 
		
		  System.out.println("1 Year interset : " + interest);
		 System.out.println("5 Year interset add Total Amount : " + total);
		 
	  
	}
}
