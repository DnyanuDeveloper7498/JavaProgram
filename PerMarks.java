import java.util.Scanner;

class PerMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Eneter a Marks : ");
		
		double marks =sc.nextDouble();
		
	final double TOTAL_MARKS=500;
		
		if (marks<0|| marks>500)
		{
			System.out.println("Invalid Marks");
			//System.exit(0);
			return;
		}
	   
	    double per =( marks/ TOTAL_MARKS)*100;
		 
		 String grade="" , remark="";
		
		if (per>=90)
		{
			grade="O";
			remark="Outstanding";
		}
			
		else if (per>=75)
		{
			grade="A++";
			remark="First Class with Distinction";
		}
		else if (per>=60)
		{
			grade="A";
			remark ="First Class ";
		}
		
		else if (per>=50)
		{
			grade="B";
			remark =" Second Class";
		}
		
		else if (per>=35)
		{
			grade="C";
			remark ="Pass";
		}
		else 
		{
		  grade ="F";
		  remark ="Fail";
		}
		
		System.out.println("Grade: "+grade);
		System.out.println("Remark :"+remark);
		System.out.println("Marks :"+ marks +"/"+ TOTAL_MARKS);
		System.out.println("Percentage : " + per +"%");
	}
}
