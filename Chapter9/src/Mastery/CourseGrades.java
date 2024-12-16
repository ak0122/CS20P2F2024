/*

Program: CourseGrades.java          Last Date of this Revision: December 15, 2025

Purpose: An application which allows you to input data of test scores of students and view it as a spreadsheet, and calculate different averages

Author: Aryan K, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CourseGrades {

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
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
			input.nextLine();
		switch(choice)
		{
		case 0: System.out.println("You have successfully quit the program.");
		break;
		
		case 1: gb.getGrades();
				break;
		
		case 2: gb.showGrades();
				break;
		
		case 3:
				System.out.println("Please enter the name of student whose average is required: ");
				String name = input.nextLine();
				
				if(gb.studentAvg(name) == -1)
				{
					System.out.println("INVALID name. Please try again");
				}
				
				else {
				System.out.println(" The average score for "+ name.toUpperCase() + " is " + df.format(gb.studentAvg(name)));
				}
				
				break;
			
			
		case 4: 
				System.out.print("Enter the number of the test whose average is required: ");
				int testnum = input.nextInt();
				
				if(gb.testAvg(testnum) == -1)
				{
					System.out.println("INVALID test no. Please try again");
				}
				
				else {
				System.out.println(" The average for this test was " + df.format(gb.testAvg(testnum)));
				}
				break;
				
		}
	}
}
}
/* Screen Dump
 * 
First, Please enter the names of each student

Enter the name of student 1: 
Aryan
Enter the name of student 2: 
Josh
Enter the name of student 3: 
Mark
Enter the name of student 4: 
David
Enter the name of student 5: 
Antony
Enter the name of student 6: 
Daisy
Enter the name of student 7: 
Justin
Enter the name of student 8: 
Will
Enter the name of student 9: 
Tom S
Enter the name of student 10: 
Adam
Enter the name of student 11: 
Jayden
Enter the name of student 12: 
James
Next, Please enter the grades of student

Enter the grades for ARYAN: 
Enter grade 1: 
54
Enter grade 2: 
75
Enter grade 3: 
86
Enter grade 4: 
90
Enter grade 5: 
97
Enter the grades for JOSH: 
Enter grade 1: 
76
Enter grade 2: 
48
Enter grade 3: 
95
Enter grade 4: 
36
Enter grade 5: 
8
Enter the grades for MARK: 
Enter grade 1: 
5
Enter grade 2: 
85
Enter grade 3: 
64
Enter grade 4: 
74
Enter grade 5: 
26
Enter the grades for DAVID: 
Enter grade 1: 
74
Enter grade 2: 
84
Enter grade 3: 
65
Enter grade 4: 
85
Enter grade 5: 
98
Enter the grades for ANTONY: 
Enter grade 1: 
74
Enter grade 2: 
85
Enter grade 3: 
85
Enter grade 4: 
26
Enter grade 5: 
74
Enter the grades for DAISY: 
Enter grade 1: 
74
Enter grade 2: 
26
Enter grade 3: 
64
Enter grade 4: 
26
Enter grade 5: 
71
Enter the grades for JUSTIN: 
Enter grade 1: 
90
Enter grade 2: 
88
Enter grade 3: 
82
Enter grade 4: 
78
Enter grade 5: 
91
Enter the grades for WILL: 
Enter grade 1: 
99
Enter grade 2: 
100
Enter grade 3: 
91
Enter grade 4: 
93
Enter grade 5: 
89
Enter the grades for TOM S: 
Enter grade 1: 
15
Enter grade 2: 
76
Enter grade 3: 
75
Enter grade 4: 
53
Enter grade 5: 
74
Enter the grades for ADAM: 
Enter grade 1: 
25
Enter grade 2: 
75
Enter grade 3: 
89
Enter grade 4: 
64
Enter grade 5: 
85
Enter the grades for JAYDEN: 
Enter grade 1: 
36
Enter grade 2: 
85
Enter grade 3: 
48
Enter grade 4: 
85
Enter grade 5: 
96
Enter the grades for JAMES: 
Enter grade 1: 
96
Enter grade 2: 
37
Enter grade 3: 
85
Enter grade 4: 
96
Enter grade 5: 
94
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
1
Press ENTER to continue: 

Enter the name of the student you want the grades for: 
Tom S
TOM S has grades: 
Test 1: 15
Test 2: 76
Test 3: 75
Test 4: 53
Test 5: 74
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
2
[54] [76] [5] [74] [74] [74] [90] [99] [15] [25] [36] [96] 
[75] [48] [85] [84] [85] [26] [88] [100] [76] [75] [85] [37] 
[86] [95] [64] [65] [85] [64] [82] [91] [75] [89] [48] [85] 
[90] [36] [74] [85] [26] [26] [78] [93] [53] [64] [85] [96] 
[97] [8] [26] [98] [74] [71] [91] [89] [74] [85] [96] [94] 
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
3
Please enter the name of student whose average is required: 
James
 The average score for JAMES is 81.60
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
4
Enter the number of the test whose average is required: 8
INVALID test no. Please try again
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
4
Enter the number of the test whose average is required: 3
 The average for this test was 77.42
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
1
Press ENTER to continue: 

Enter the name of the student you want the grades for: 
aryan
ARYAN has grades: 
Test 1: 54
Test 2: 75
Test 3: 86
Test 4: 90
Test 5: 97
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
3
Please enter the name of student whose average is required: 
Anthony
INVALID name. Please try again
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
3
Please enter the name of student whose average is required: 
Antony
 The average score for ANTONY is 68.80
Please select one of the following options: 
1. View a Student's Grades
2. View a Spreadsheet of Class Scores
3. View a Student's Average Grade
4. View the Average Grade for a Test
0. QUIT Program 
0
You have successfully quit the program.

 
 */
