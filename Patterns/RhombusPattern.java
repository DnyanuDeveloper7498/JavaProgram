class RhombusPattern 
{
	public static void main(String[] args) 
	{
		int n=5;
		int totalLine=n;
		int star=5;
		int space=n-1;
		int currentLine=1;
		
		
		while (currentLine<=totalLine)
		{
		   
		   
		   // space print 
		   
		    for (int i=1;i<=space;i++)
			{
                System.out.print(" ");			
			}
		   
			// star print 
			
			 for (int i=1;i<=star;i++)
			 {
				 if(i==1|| i==n || currentLine==1 || currentLine==n)
				 {
					 System.out.print("*");
				 }
				  else 
				 {
					  System.out.print(" ");
				 }
				 
				 
			 }
			 
			 //next Line print 
			 System.out.println();
			 space--;
			 currentLine++;
			
		}
		
	}
}
