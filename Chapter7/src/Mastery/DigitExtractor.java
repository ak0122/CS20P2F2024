package Mastery;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int usernum = input.nextInt();
		
		Num number = new Num(usernum);
		
		//Start While loop to keep coming back to options until user inputs 0
			char choice = ' ';
			while(choice != 'q')
			{
				System.out.println("show (W)hole number.");
				System.out.println("show (O)nes Place number.");
				System.out.println("show (T)ens Place number.");
				System.out.println("show (H)hundreds Place number.");
				System.out.println("(Q)uit");
				
				System.out.println("Enter your Choice: ");
				choice = input.next().toLowerCase().charAt(0);
				
				switch(choice)
				{
			  case 'w':
                  System.out.println("Whole Number: " + number.getNum());
                  break;
              case 'h':
                  System.out.println("Hundreds Digit: " + number.getHundreds());
                  break;
              case 't':
                  System.out.println("Tens Digit: " + number.getTens());
                  break;
              case 'o':
                  System.out.println("Ones Digit: " + number.getOnes());
                  break;
              case 'q':
                  System.out.println("Quitting the program.");
                  break;
              default:
                  System.out.println("Invalid command. Please try again.");
                  input.close();
			}

	
	
	}
			System.out.println("Thank you for using the program.");
}}
