import java.util.Scanner;
class Evm 
{
	static int bjp , cong , aap ,mns,nota; 
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter a Population :");
		
	     int Population = sc.nextInt();
		
		
		   for (int i=1; i<=Population;i++ )
		   {
			   
			    System.out.println("\n ***** Welecome *** ");
				
				System.out.println ("\n 1.BJP \n 2.CONG \n 3.AAP \n 4.MNS \n 5.NOTA");
				
				System.out.println("Eneter Your Response: ");
				
				String resp = sc.next().toUpperCase();
				
				
		        if (resp.equals("BJP"))
		        {
					bjp++;
				
				   System.out.println("Vote for BJP ");
				   System.out.println("Sabka Saath, Sabka Vikas, Sabka Vishwas \n");
					
		        }
				else if (resp.equals("CONG"))
				{
					cong++;
					
					System.out.println("Vote for Congress");
                    System.out.println("Bharat Jodo \n");
				}
				
				else if (resp.equals("AAP"))
				{
					aap++;
					System.out.println("Vote for AAP");
                    System.out.println("Kattar Imaandaar \n");
				}
				
				else if (resp.equals("MNS"))
				{
					mns++;
					System.out.println("Vote for MNS");
                    System.out.println("Marathi Manoos, Maharashtra First \n");
				}
				 else if (resp.equals("NOTA"))
				 {
					 nota++;
					 
					 System.out.println("Vote for NOTA");
                     System.out.println("None of the Above \n");
				 }
		        else 
		        {
					System.out.println("Invalide Response");
					i--;
		        }
		   }
		
		     System.out.println("BJP :" + bjp);
		     System.out.println("CONG :" + cong);
		     System.out.println("AAP :" + aap);
		     System.out.println("MNS :" + mns);
			 
			  if (bjp>= cong && bjp>=aap && bjp>=mns && bjp>=nota)
			  {
				  
				  System.out.println("BJP is Won the election " + bjp +" Votes");
			  }
			  else if (cong>=bjp && cong>=aap && cong >=mns && cong>=nota)
			  {
				  System.out.println("Cong is Won the election " + cong +" Votes");
			  }
			   else if (aap>=bjp && aap>=cong && aap>=mns && aap>=nota)
			  {
				  System.out.println("AAP is Won the election " + aap +" Votes");
			  }
			  else if (mns>=bjp && mns>=cong && mns>=aap && mns>=nota)
			  {
				  System.out.println("MNS is Won the election " + mns +" Votes");
			  }
			  else 
		{
			System.out.println("Nota is Won the election " + nota+" Votes");
		}
		
	}
}
