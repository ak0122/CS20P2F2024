package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeBook {
	
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    private int[][] grades = new int[5][12]; // 5 tests, 12 students
    String[] studentName = new String[12];

    int rows = grades.length;
    int cols = grades[0].length;

    public void setName() {
        for (int col = 0; col < grades[0].length; col++) {
            System.out.println("Enter the name of student " + (col + 1) + ": ");
            studentName[col] = input.nextLine().toLowerCase();
        }
    }

    public void setGrades() {
        for (int col = 0; col < grades[0].length; col++) {
            System.out.println("Enter the grades for " + studentName[col].toUpperCase() + ": ");
            for (int row = 0; row < grades.length; row++) {
                System.out.println("Enter grade " + (row + 1) + ": ");
                grades[row][col] = input.nextInt();
            }
            input.nextLine(); // rid the leftover newline
        }
    }

    public void getGrades() {
    	
    	System.out.println("Press ENTER to continue: ");
        input.nextLine(); //get rid of the leftover newline

        int location = -1;
        do {
            System.out.println("Enter the name of the student you want the grades for: ");
            String student = input.nextLine().toLowerCase();

            location = Search.linear(studentName, student);
            if (location == -1) {
                System.out.println("The name you entered was NOT FOUND. Please try again");
            } else {
                System.out.println(student.toUpperCase() + " has grades: ");
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
        int location = Search.linear(studentName, name.toLowerCase());
        if (location == -1) {
            return -1; // show that the student was not found
        }

        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i][location];
        }

        return (sum / grades.length); // Average of the student's grades
    }

    public double testAvg(int testno) {
        if (testno < 1 || testno > 5) {
            return -1; // highlight if a invalid test number was chosen
        }

        double sum = 0;
        for (int i = 0; i < grades[0].length; i++) {
            sum += grades[testno - 1][i]; // sum the individual grades and account for the indexing
        }

        return sum / grades[0].length; // Average of the test scores
    }
}
