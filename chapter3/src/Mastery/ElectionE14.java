/*

Program: ElectionE14.java          Last Date of this Revision: September 24, 2024

Purpose: An application which tells .

Author: Aryan Kapoor, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class ElectionE14 {

	public static void main(String[] args)
	{
		
		//Declaration
		String candidate1,candidate2,loc1,loc2,loc3;
		int vote11,vote12,vote13,vote21,vote22,vote23,tv1,tv2,tv;
		double percent1,percent2;
		
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
	percent1= (double)tv1/tv;
	percent2=(double)tv2/tv;
	
	//final cumulative votes and percentages
	System.out.print("\n\nCandidate        Votes    Percentage");
	System.out.print("\n"+ candidate1+ "          "+tv1+"   "+percent.format(percent1) );
	System.out.print("\n"+ candidate2+ "          "+tv2+"   "+percent.format(percent2) );
	System.out.print("\n\nTOTAL VOTES: "+tv);
	}
}

/* Screen Dump
 * 
 * Case 1:
 * Please enter the name of the first candidate: Donald Trump
Please enter the name of the second candidate: Kamala Harris
Please enter the first location: New York
Please enter the second location: Connecticut
Please enter the third location: Chicago
Please enter the no. of votes Donald Trump got in New York.413352
Please enter the no. of votes Donald Trump got in Connecticut.456332
Please enter the no. of votes Donald Trump got in Chicago.723456
Please enter the no. of votes Kamala Harris got in New York.634536
Please enter the no. of votes Kamala Harris got in Connecticut.234645
Please enter the no. of votes Kamala Harris got in Chicago.834533


The election results in New York is: 
Donald Trump: 413352
Kamala Harris: 634536

The election results in Connecticut is: 
Donald Trump: 456332
Kamala Harris: 234645

The election results in Chicago is: 
Donald Trump: 723456
Kamala Harris: 834533

Candidate        Votes    Percentage
Donald Trump          1593140   48%
Kamala Harris          1703714   52%

TOTAL VOTES: 3296854

Case 2:
Please enter the name of the first candidate: Aryan Kapoor
Please enter the name of the second candidate: Cole Palmer
Please enter the first location: Calgary
Please enter the second location: Vancouver
Please enter the third location: Toronto
Please enter the no. of votes Aryan Kapoor got in Calgary.1256765
Please enter the no. of votes Aryan Kapoor got in Vancouver.1241515
Please enter the no. of votes Aryan Kapoor got in Toronto.652314
Please enter the no. of votes Cole Palmer got in Calgary.561257
Please enter the no. of votes Cole Palmer got in Vancouver.567232
Please enter the no. of votes Cole Palmer got in Toronto.652346


The election results in Calgary is: 
Aryan Kapoor: 1256765
Cole Palmer: 561257

The election results in Vancouver is: 
Aryan Kapoor: 1241515
Cole Palmer: 567232

The election results in Toronto is: 
Aryan Kapoor: 652314
Cole Palmer: 652346

Candidate        Votes    Percentage
Aryan Kapoor          3150594   64%
Cole Palmer          1780835   36%

TOTAL VOTES: 4931429
 */
