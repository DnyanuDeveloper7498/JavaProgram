class DiamondPattern 
{
	public static void main(String[] args) 
	{
		
		int n=5 ,
	    totalLine=2*n,
	     star=1,
		 space=2*n-1,
		 currentLine=1;
		
		while (currentLine<=totalLine)
		{
			
			// space print 
			
			for (int i=1;i<=space ;i++)
			{
				System.out.print(" ");
			}
			
			// star print 
			
			
			for (int i=1;i<=star ;i++ )
			{
			  System.out.print("*");
			}
			
			// next Line peparation 
			
			System.out.println();
			
			
			if (currentLine<n)
			{
				space--;
			    star=star+2;
			  
			}
			else 
			{
				 space++;
			     star=star-2;
			}
			
			currentLine++;
			
		}
	}
}
