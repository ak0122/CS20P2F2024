package Mastery;

import java.util.Scanner;

public class MySavings {

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Prompt user for inital bank balance;
		System.out.println("Please Enter your initial Balance in dollars: ");
		double initalB = input.nextDouble();
		
		//Set up user's bank balance by using object
			PiggyBank userbank = new PiggyBank(initalB); 
		
		//Start While loop to keep coming back to options until user inputs 0
			int choice = 1;
			while(choice !=0)
			{
				//Ask user and present their choices
				System.out.println("1. Enter Total in Bank.");
				System.out.println("2. Add a Penny.");	
				System.out.println("3 Add a Nickel.");	
				System.out.println("4. Add a Dime..");
				System.out.println("5. Add a Quarter.");	
				System.out.println("6. Take out money.");	
				System.out.println("Enter 0 to QUIT");	
				System.out.println("Enter your choice: ");	
				choice = input.nextInt();
				
				switch (choice)
				{
				
				case 0:
					System.out.println("Quitting the program.");
				
				case 1 : 
					System.out.println(userbank.toString());
					break;
					
				case 2 : 
					System.out.println(userbank.AddP());
					break;
					
				case 3 : 
					System.out.println(userbank.AddN());
					break;
					
				case 4 : 
					System.out.println(userbank.AddD());
					break;
					
				case 5 : 
					System.out.println(userbank.AddQ());
					break;
					
				case 6 :
					
					System.out.println("Choose the amount you want to take out: ");
					 double M_out = input.nextDouble();
					 
					System.out.println(userbank.takeM(M_out));
				
			}

			
	}
			System.out.println("Thank you for using this Program.");
			input.close();
}
}
