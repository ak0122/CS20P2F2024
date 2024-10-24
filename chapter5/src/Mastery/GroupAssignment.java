/*

Program: GroupAssignment.java          Last Date of this Revision: October 20, 2024

Purpose: An application that assigns you to a group based on your last name.

Author: Aryan K, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args)
	{
		//Declaration
		String firstn, lastn;
		
		//Prepare for User Input
		Scanner UserInput = new Scanner(System.in);
		
	//Get the First and Last name from User
		
	System.out.print("Enter your first name: ");
	firstn = UserInput.next();
	
	System.out.print("Enter your last name: ");
	lastn = UserInput.next();
	
	//Convert last name to lower case
	String lastnlower = lastn.toLowerCase();
	
	UserInput.close();
	
	//getting the first letter in last name:
	char lastnameinitial = lastnlower.charAt(0);

	//If statement to arrange groups depending on initial
	if (lastnameinitial >= 'a' && lastnameinitial <= 'i')
	{
		System.out.print(firstn + " "+ lastn + " is assigned to Group 1");
	}
	else if (lastnameinitial > 'i' && lastnameinitial <= 's')
	{
		System.out.print(firstn + " "+ lastn + " is assigned to Group 2");
	}
	else
	{
		System.out.print(firstn + " "+ lastn + " is assigned to Group 3");
	}
	}
	/* Screen Dump
	 
	Case 1:
	Enter your first name: Aryan
	Enter your last name: Kapoor
	Aryan Kapoor is assigned to Group 2
	
	Case 2:
	 Enter your first name: Justin
	Enter your last name: Fung
	Justin Fung is assigned to Group 1
	 
	 */
}

