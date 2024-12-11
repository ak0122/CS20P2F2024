package Mastery;

import java.util.Scanner;

public class CourseGrades {

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		
		GradeBook gb = new GradeBook(); 
		
		System.out.println("First, Please enter the names of each student\n");
		gb.setName();
		
		System.out.println("Next, Please enter the grades of student\n");
		gb.setGrades();
		
		int choice = 1;
		
		while(choice != 0)
		{
			
		System.out.println("Please select one of the following options: ");
		System.out.println("1. View a Student's Grades");
		System.out.println("2. View a Spreadsheet of Class Scores");
		System.out.println("3. View a Student's Average Grade");
		System.out.println("4. View the Average Grade for a Test");
		System.out.println("0. QUIT Program ");
		
		choice = input.nextInt();
			
		switch(choice)
		{
		case 0: System.out.println("You have successfully quit the program.");
		
		case 1: gb.getGrades();
				break;
		
		case 2: gb.showGrades();
				break;
		
		case 3:
				System.out.print("Please enter the name of student whose average is required: ");
				String name = input.nextLine();
				gb.studentAvg(name);
				break;
			
			
		case 4: 
				System.out.print("Enter the number of the test whose average is required: ");
				int testnum = input.nextInt();
				gb.testAvg(testnum);
				break;
		}
	}
}
}
