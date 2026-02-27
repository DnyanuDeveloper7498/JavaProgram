class KPattern 
{
	public static void main(String[] args) 
	{
        int n =4;
		
		int totalLine =2*n ,currentLine=1,star=n,space=1;
		
		while(currentLine<=totalLine)
		{
			
			// sapce print 
			
			/*for (int i=1;i<=space ;i++ )
			{
				System.out.print(" ");
			}*/
			
			//star print
			
			for (int i=1;i<=star ;i++ )
			{
				System.out.print("* ");
			}
			
			
			// nextLine 
			
			System.out.println();
			
			  if(currentLine<4)
			{
				 star--;  
			}
			 else 
			{
				 star++; 
			}
			
			currentLine++;
			
			
			
		}
		
	
	}
}
