package Mastery;

import java.util.Scanner;

public class Grades1 {

	    Scanner input = new Scanner(System.in);

	    private int[][] grades = new int[5][12]; // 5 tests, 12 students
	    String[] studentName = new String[12];

	    int rows = grades.length;
	    int cols = grades[0].length;

	    public void setName() {
	        for (int row = 0; row < grades[0].length; row++) {
	            System.out.println("Enter the name of student " + (row + 1) + ": ");
	            studentName[row] = input.nextLine();
	        }
	    }

	    public void setGrades() {
	        for (int row = 0; row < grades[0].length; row++) {
	            System.out.println("Enter the grades for " + studentName[row] + ": ");
	            for (int col = 0; col < grades.length; col++) {
	                System.out.println("Enter grade " + (col + 1) + ": ");
	                grades[col][row] = input.nextInt();
	            }
	            input.nextLine(); // consume the leftover newline
	        }
	    }

	    public void getGrades() {
	        input.nextLine(); // consume the leftover newline from previous input

	        int location = -1;
	        do {
	            System.out.println("Enter the name of the student you want the grades for: ");
	            String student = input.nextLine();

	            location = Search.linear(studentName, student);
	            if (location == -1) {
	                System.out.println("The name you entered was NOT FOUND. Please try again");
	            } else {
	                System.out.println(student + " has grades: ");
	                for (int i = 0; i < grades.length; i++) {
	                    System.out.println("Test " + (i + 1) + ": " + grades[i][location]);
	                }
	            }
	        } while (location == -1);
	    }

	    public void showGrades() {
	        for (int row = 0; row < grades.length; row++) {
	            for (int col = 0; col < grades[0].length; col++) {
	                System.out.print("[" + grades[row][col] + "] ");
	            }
	            System.out.println();
	        }
	    }

	    public double studentAvg(String name) {
	        int location = Search.linear(studentName, name);
	        if (location == -1) {
	            return -1; // Indicate that the student was not found
	        }

	        double sum = 0;
	        for (int i = 0; i < grades.length; i++) {
	            sum += grades[i][location];
	        }

	        return (sum / grades.length); // Average of the student's grades
	    }

	    public double testAvg(int testno) {
	        if (testno < 1 || testno > 5) {
	            return -1; // Invalid test number
	        }

	        double sum = 0;
	        for (int i = 0; i < grades[0].length; i++) {
	            sum += grades[testno - 1][i]; // Adjust for 0-based indexing
	        }

	        return sum / grades[0].length; // Average of the test scores
	    }
	}
