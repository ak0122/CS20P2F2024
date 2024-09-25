package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class ElectionE14 {

	public static void main(String[] args)
	{
		
		//Declaration
		String candidate1,candidate2,loc1,loc2,loc3;
		int vote11,vote12,vote13,vote21,vote22,vote23,tv1,tv2,tv;
		double p1,p2;
		
		//Set up percentage format
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		//Prepare for User Input
	Scanner UserInput = new Scanner(System.in);
		
	System.out.print("Please enter the name of the first candidate: ");
	candidate1 = UserInput.nextLine();
	
	System.out.print("Please enter the name of the second candidate: ");
	candidate2 = UserInput.nextLine();
		
	System.out.print("Please enter the first location: ");
	loc1 = UserInput.nextLine();
	
	System.out.print("Please enter the second location: ");
	loc2 = UserInput.nextLine();
	
	System.out.print("Please enter the third location: ");
	loc3 = UserInput.nextLine();
	
	System.out.print("Please enter the no. of votes "+ candidate1 +" got in "+ loc1 +".");
	vote11 = UserInput.nextInt();
	
	System.out.print("Please enter the no. of votes "+ candidate1 +" got in "+ loc2 +".");
	vote12 = UserInput.nextInt();
	
	System.out.print("Please enter the no. of votes "+ candidate1 +" got in "+ loc3 +".");
	vote13 = UserInput.nextInt();
	
	System.out.print("Please enter the no. of votes "+ candidate2 +" got in "+ loc1 +".");
	vote21 = UserInput.nextInt();
	
	System.out.print("Please enter the no. of votes "+ candidate2 +" got in "+ loc2 +".");
	vote22 = UserInput.nextInt();
	
	System.out.print("Please enter the no. of votes "+ candidate2 +" got in "+ loc3 +".");
	vote23 = UserInput.nextInt();
	
	//Final Output for displaying results
	
	System.out.print("\n\nThe election results in " +loc1+ " is: ");
	System.out.print("\n" +candidate1 + ": " + vote11  );
	System.out.print("\n" +candidate2 + ": " + vote21  );
	
	System.out.print("\n\nThe election results in " +loc2+ " is: ");
	System.out.print("\n" +candidate1 + ": " + vote12  );
	System.out.print("\n" +candidate2 + ": " + vote22  );
	
	System.out.print("\n\nThe election results in " +loc3+ " is: ");
	System.out.print("\n" +candidate1 + ": " + vote13  );
	System.out.print("\n" +candidate2 + ": " + vote23  );
	
	tv1= vote11+vote12+vote13;
	tv2 = vote21+vote22+vote23;
	tv = tv1+tv2;
	p1= (double)tv1/tv;
	p2=(double)tv2/tv;
	
	//final cumulative votes and percentages
	System.out.print("\n\nCandidate        Votes    Percentage");
	System.out.print("\n"+ candidate1+ "            "+tv1+"      "+percent.format(p1) );
	System.out.print("\n"+ candidate2+ "          "+tv2+"      "+percent.format(p2) );
	System.out.print("\n\nTOTAL VOTES: "+tv);
	}
}
