
/*Q3. Electricity Units

Ghar me daily 15 units electricity use hoti hai.
1 unit ka cost ₹6 hai.
Java program likho jo 1 year ka total bill calculate kare. */

class ElectricityUnits
{
	public static void main(String[] args) 
	{                 //unit /day /years days 
	    double unit = (15/1 *365);
		  
		 double lightBill = unit * 6;
		 
		System.out.println("1 Year Light bill Unit:" + unit);
		
		System.out.println("1 Year Light Bill:"+ lightBill);
	}
}
