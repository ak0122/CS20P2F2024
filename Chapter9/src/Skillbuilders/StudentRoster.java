package Skillbuilders;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter the number of people within the roster: ");
		int numRoster = input.nextInt();
		
		String[] roster = new String[numRoster];
		
		for(int i =0; i < roster.length; i++)
		{
			System.out.println("Please enter the name of the student");
			roster[i]= input.next();
		}
		
		System.out.println("\n ROSTER:");
		
		for(int j = 0; j < roster.length; j++ )
		{
			System.out.println("- "+ roster[j]);
		}
	}
}
