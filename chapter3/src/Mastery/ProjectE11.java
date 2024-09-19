package Mastery;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class ProjectE11 {

	/*

	Program: ProjectE11.java          Last Date of this Revision: September 19, 2024

	Purpose: An application which 

	Author: Your Name, 
	School: CHHS
	Course: Computer Programming ??
	 

	*/

	public static void main(String[] args)
	{
		//Declaration
		double d, c, db, t, totaltime;
		
		
		//Create formats to round and find percentages
		DecimalFormat df = new DecimalFormat("0.00");
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		//Prep for User Input
		Scanner UserInput = new Scanner(System.in);
		
		//Get Users Inputs after giving the user Instructions
		System.out.print("Enter the times it takes you to complete the following tasks in hours.");
		
		System.out.print("Designing: ");
		d = UserInput.nextDouble();

		System.out.print("Coding: ");
		c = UserInput.nextDouble();
				
		System.out.print("Debugging: ");
		db = UserInput.nextDouble();
		
		System.out.print("Testing: ");
		t = UserInput.nextDouble();
		
		totaltime = d+c+db+t ;
		
		
		
	}
}

