/*

Program: MathTutor.java          Last Date of this Revision: September 27, 2024

Purpose: An application that uses if-else statements and random numbers to give the user a random math equation and tell them if they got it right or wrong.

Author: Aryan Kapoor, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
public class MathTutor {

		public static void main(String[] args)
		{
			//declaration
			int n_1,n_2,op,ans;
			String ans4;
			
			//setting up user input and random number
			Random random = new Random();
			Scanner UserInput = new Scanner(System.in);
			
			op = random.nextInt(4);
			n_1 = random.nextInt(10)+1;
			n_2 = random.nextInt(10)+1;
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			//addition case --> op = 0 corresponds to add
			if (op == 0) {
				System.out.print("What is " +n_1+"+"+n_2+"? ");
				ans = UserInput.nextInt();
				if (ans == n_1 +n_2) {
					System.out.print("You got the answer RIGHT! Good Job.");
				}
					else {
						System.out.print("You got the answer WRONG.");
					}}
				
				//Subtraction case --> op == 1 is subtract
				else if (op == 1) {
					System.out.print("What is " +n_1+"-"+n_2+"? ");
					ans = UserInput.nextInt();
					if (ans == n_1 - n_2) {
						System.out.print("You got the answer RIGHT! Good Job.");
					}
						else {
							System.out.print("You got the answer WRONG.");
						}
					}
			//Multiplication case --> op == 2 is multiply
				else if (op == 2) {
					System.out.print("What is " +n_1+"*"+n_2+"? ");
					ans = UserInput.nextInt();
					if (ans == n_1*n_2) {
						System.out.print("You got the answer RIGHT! Good Job.");
					}
						else {
							System.out.print("You got the answer WRONG.");
						}}
			//Division case --> op == 3 is divide
					else if (op == 3) {
						System.out.print("What is " +n_1+"/"+n_2+" to 2 decimal places? ");
						ans4 = UserInput.next();
						if (ans4.equals(df.format((double)n_1/(double)n_2))) {
							System.out.print("You got the answer RIGHT! Good Job.");
						}
							else {
								System.out.print("You got the answer WRONG.");
							}
				}	
			}
		}
/* Screen Dump
 * Case 1:
 * What is 1/3 to 2 decimal places? 0.33
You got the answer RIGHT! Good Job.

Case 2:
What is 3/7 to 2 decimal places? 0.42
You got the answer WRONG.

Case 3:
What is 8+10? 18
You got the answer RIGHT! Good Job.
*/
