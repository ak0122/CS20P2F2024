package Mastery;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class ProjectE11 {

	/*

	Program: ProjectE11.java          Last Date of this Revision: September 19, 2024

	Purpose: An application which outputs the proportion of time you spent on a Java project as a percentage.

	Author: Aryan Kapoor, 
	School: CHHS
	Course: Computer Programming 20
	 

	*/

	public static void main(String[] args)
	{
		//Declaration
		double d, c, db, t, totaltime;
		
		
		//Create a format to find percentages
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		//Prep for User Input
		Scanner UserInput = new Scanner(System.in);
		
		//Get Users Inputs after giving the user Instructions
		System.out.print("Enter the time it takes you to complete the following tasks in hours.");
		
		System.out.print("\nDesigning: ");
		d = UserInput.nextDouble();

		System.out.print("Coding: ");
		c = UserInput.nextDouble();
				
		System.out.print("Debugging: ");
		db = UserInput.nextDouble();
		
		System.out.print("Testing: ");
		t = UserInput.nextDouble();
		
		//Find total time taken for percentages
		totaltime = d+c+db+t ;
		
		//Find the proportion of time each task takes
		d = d/totaltime;
		c= c/totaltime;
		db = db/totaltime;
		t = t/totaltime;
		
		//Print out the data we calculated
		System.out.print("\nTask:              % Time:");
		System.out.print("\nDesigning          "+ percent.format(d));
		System.out.print("\nCoding             "+ percent.format(c));
		System.out.print("\nDebugging          "+ percent.format(db));
		System.out.print("\nTesting            "+ percent.format(t));
		
		/*Screen Dump
		 TestCase1
		Enter the time it takes you to complete the following tasks in hours.
		Designing: 14
		Coding: 23
		Debugging: 15
		Testing: 16

		Task:              %Time:
		Designing          21%
		Coding             34%
		Debugging          22%
		Testing            24%
		
		TestCase2
		Enter the time it takes you to complete the following tasks in hours.
		Designing: 0
		Coding: 
			14
		Debugging: 15
		Testing: 20

		Task:              %Time:
		Designing          0%
		Coding             29%
		Debugging          31%
		Testing            41%
		
		*/
		
	}
}

