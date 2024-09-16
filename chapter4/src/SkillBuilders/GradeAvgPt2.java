package SkillBuilders;

import java.text.NumberFormat;
import java.util.Scanner;

public class GradeAvgPt2 {

	
	public static void main(String[] args)
	
	{
		//declaration
		int totgrade;
		double avg;
		
		//formatting
		NumberFormat percent = NumberFormat.getPercentInstance() ;
		NumberFormat decimal = NumberFormat.getNumberInstance() ;
		
		//preparing for user input
		Scanner UserInput = new Scanner(System.in);
		
		System.out.print("Enter the First grade: ");
		totgrade = UserInput.nextInt();
		
		System.out.print("Enter the second grade: ");
		totgrade += UserInput.nextInt();
		
		System.out.print("Enter the third grade: ");
		totgrade += UserInput.nextInt();
		
		System.out.print("Enter the fourth grade: ");
		totgrade += UserInput.nextInt();
		
		System.out.print("Enter the fifth grade: ");
		totgrade += UserInput.nextInt();
		
		//calculate average
		avg = totgrade/500;
		
		//Show average grade as a percentage
		System.out.print("the average grade is: " + percent.format(avg) );
		
		//Receiving user input]
		
		
		
	}
}
