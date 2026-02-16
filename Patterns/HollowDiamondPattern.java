
class  HollowDiamondPattern  
{
	public static void main(String[] args) 
	{
		int n=5 , totalLine=2*n, star=1, space=2*n-2,currentLine=1;
		
		 while (currentLine<=totalLine)
		 {
			 
			 //  space print 
			 
			    for (int i=1;i<=space ;i++ )
			    {
					System.out.print(" ");
			    }
			 
			 // star print
			 
			    for (int i=1;i<=star;i++ )
			    {
					
					if(i==1 || i==star)
					{
						System.out.print("*");
					}
					 else
					{
						System.out.print(" ");
					}
					
			    }
			 
			 
			 // nextLine preparation 
			 
			   System.out.println();
			 
			    if (currentLine<n)
			    {
					
			      star=star+2;
				  space--;
			    }
			    else 
			    {
					
			      star=star-2;
				  space++;
			    }
			  
				  currentLine++;	 
		 }
		
	}
}
