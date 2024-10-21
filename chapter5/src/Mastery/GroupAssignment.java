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
}
