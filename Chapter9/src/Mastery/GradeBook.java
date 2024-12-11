package Mastery;

import java.util.Scanner;

public class GradeBook {
	
Scanner input = new Scanner(System.in);

private int[][] grades = new int[5][12];

String[] studentName = new String[12];

int rows = grades.length;
int cols = grades[0].length;

public void setName()
{

for (int row = 0; row < grades[0].length;row++)
{
	System.out.println("Enter the name of student " + (row+1) + ": " );
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
		
	do{
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
			System.out.println(student + " has grades: ");
			System.out.println(grades[studentno]);
		}
	 }
			while(location == -1);
	}
	
	public void showGrades()
	{
		for(int row = 0; row < grades.length; row++)
			 {
			 	for (int col = 0; col < grades[0].length; col++)
			 	{
			 	System.out.print("[" + grades[row][col] + "]");
			 	}
			 System.out.println();
			 }
	}
	
	public double studentAvg(String name)
	{
		int location = Search.linear(studentName, name);
		
		double sum = 0;
		
		for(int i= 0; i <grades.length;i++)
		{
			sum += grades[location][i];
		}
		
		 double avg_s = sum/5 ;
		 
		 return avg_s;
	}
	
	public double testAvg(int testno)
	{
		
		double sum = 0;
		
		for(int i= 0; i <grades[0].length;i++)
		{
			sum += grades[i][testno];
		}
		
		 double avg_t = sum/12 ;
		 
		 return avg_t;
	}
	
	
}
