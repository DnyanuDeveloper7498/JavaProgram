// stonepaper games 
import java.util.Scanner;

class StonePaperGame
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
	  
	    infindeLoop: 
		
		 for (; ; )
		 {
			 
			 System.out.println("\n***** Welecome ***** \n");
			 // user implemention 
			 
			 System.out.println(" 1.STONE \n 2.PEPER \n 3.SCISSOR \n");
			 
			 System.out.println(" Eneter Your Response : ");
			 int dgtUser =sc.nextInt();
			 
			 String user ="";
			 
			 
			 if (dgtUser==1) user="STONE";
			 else if (dgtUser==2) user="PEPER";
			 else if (dgtUser==3) user="SCISSOR";
			 else 
			 {
				System.out.println("INVALID RESPONES \n");
				continue infindeLoop;
			 }
			 
			 // bot implemention 
			 
			 int dgtBot=0;
			 
			 for (; ; )
			 {
				 dgtBot =(int) (Math.random()*10);
				 if (dgtBot>=1 && dgtBot<=3)
				 break;
			 }
			 
			 String bot ="";
			 
			 if (dgtBot==1) bot ="STONE";
			 else if (dgtBot ==2) bot="PAPER";
			 else bot ="SCISSOR";
			 
			 System.out.printf(" %n%10s %8s" , "BOT" ,"USER");
			 System.out.printf(" %n%10s %8s" , bot ,user);
			 
			 // calculate Winner
			 
			 if (bot.equals("STONE") && user.equals("PAPER") ||
				 
			     (bot.equals("PAPER") && user.equals("SCISSOR"))||
			     
				 (bot.equals("SCISSOR")&& user.equals("STONE")))
			 {
				 System.out.println("\n ******User Won***** \n");	 
			 }
			  else if (bot.equals("STONE") && user.equals("SCISSOR") ||
				 
			     (bot.equals("PAPER") && user.equals("STONE"))||
			     
				 (bot.equals("SCISSOR")&& user.equals("PAPER")))
			 {
				 System.out.println("\n ******BOAT Won***** \n");	 
			 }
			 
			  else 
			 {
				 System.out.println("\n ****** Draw***** \n");  
			 }
			
			
			 
		 }
		
	}
}


