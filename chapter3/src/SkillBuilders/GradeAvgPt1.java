package SkillBuilders;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeAvgPt1 {

	public static void main(String[] args)
	
	{
		
		int n_1, n_2, n_3, n_4, n_5, sum;
		
		double avg ;
		
		Scanner UserInput = new Scanner(System.in);
		
		System.out.print("Enter the first grade: ");
		
		n_1 = UserInput.nextInt();
		
		System.out.print("Enter the second grade: ");
		
		n_2 = UserInput.nextInt();
		
		System.out.print("Enter the third grade: ");
		
		n_3 = UserInput.nextInt();
		
		System.out.print("Enter the fourth grade: ");
		
		n_4 = UserInput.nextInt();
		
		System.out.print("Enter the fifth grade: ");
		
		n_5 = UserInput.nextInt();
		
		
		sum = n_1 + n_2 + n_3 + n_4 +n_5;
		
		avg = (double)sum/5;
		
		System.out.print("The average grade is : " + avg);
	}
}
