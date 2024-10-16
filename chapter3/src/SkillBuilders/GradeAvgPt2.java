package SkillBuilders;

import java.text.NumberFormat;
import java.util.Scanner;

public class GradeAvgPt2 {

	
	public static void main(String[] args)
	
	{
		int totgrade;
		double avg;

		NumberFormat percent = NumberFormat.getPercentInstance() ;

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
		
		avg = (double)totgrade/500;
		
		System.out.print("Your average grade is: " + percent.format(avg) );
		
	}
}
