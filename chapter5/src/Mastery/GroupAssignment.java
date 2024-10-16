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

	lastn = lastn.toLowerCase();
	
	UserInput.close();
	
	//getting the first letter in last name:
	char lastnameinitial = lastn.charAt(0);
	switch (lastnameinitial) {
	
	case 'a': System.out.print("You are in Group 1"); break;
	case 'b': System.out.print("You are in Group 1"); break;
	case 'c': System.out.print("You are in Group 1"); break;
	case 'd': System.out.print("You are in Group 1"); break;
	case 'e': System.out.print("You are in Group 1"); break;
	case 'f': System.out.print("You are in Group 1"); break;
	case 'g': System.out.print("You are in Group 1"); break;
	case 'h': System.out.print("You are in Group 1"); break;
	case 'i': System.out.print("You are in Group 1"); break;
	
	case 'j': System.out.print("You are in Group 2"); break;
	case 'k': System.out.print("You are in Group 2"); break;
	case 'l': System.out.print("You are in Group 2"); break;
	case 'm': System.out.print("You are in Group 2"); break;
	case 'n': System.out.print("You are in Group 2"); break;
	case 'o': System.out.print("You are in Group 2"); break;
	case 'p': System.out.print("You are in Group 2"); break;
	case 'q': System.out.print("You are in Group 2"); break;
	case 'r': System.out.print("You are in Group 2"); break;
	case 's': System.out.print("You are in Group 2"); break;
	
	case 't': System.out.print("You are in Group 3"); break;
	case 'u': System.out.print("You are in Group 3"); break;
	case 'v': System.out.print("You are in Group 3"); break;
	case 'w': System.out.print("You are in Group 3"); break;
	case 'x': System.out.print("You are in Group 3"); break;
	case 'y': System.out.print("You are in Group 3"); break;
	case 'z': System.out.print("You are in Group 3"); break;

	}
	}
}
