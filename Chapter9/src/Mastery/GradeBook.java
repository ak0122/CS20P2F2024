package Mastery;

import java.util.Scanner;

public class GradeBook {
	
Scanner input = new Scanner(System.in);

private int[][] grades = new int[5][12];

String[] studentName;

int rows = grades.length;
int cols = grades[0].length;

public void setName()
{

for (int row = 0; row < grades.length;row++)
{
	System.out.println("Enter the student's name:" );
	studentName[row] = input.nextLine();
}
}

public void setGrades()
{
	for (int row = 0; row < grades.length;row++)
	{
		System.out.println("Enter the grades for "+ studentName[row] + ": ");
		for(int col = 0; col< grades[0].length;col++)
		{
			System.out.println("Enter grade" + (col+1) + ": ");
			grades[row][col] = input.nextInt();
		}
	}
}
	
	public void getGrades()
	{
		int location = -1;
		
			do {
		System.out.println("Enter the name of the student you want the grades for: ");
		String student = input.nextLine();
		
		 location = Search.linear(studentName, student);
		if (location == -1)
		{
			System.out.println("The name you entered was NOT FOUND. Please try again");
		}
		
		else
		{
			int studentno = location;
		}
	 }
			while(location == -1);
			
	}
	}
