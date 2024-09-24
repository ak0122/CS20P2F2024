package Mastery;

import java.util.Scanner;

public class ElectionE14 {

	public static void main(String[] args)
	{
		
		//Declaration
		String candidate1,candidate2,loc1,loc2,loc3;
		int vote11,vote12,vote13,vote21,vote22,vote23;
		
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
	
	System.out.print()
	}
}
